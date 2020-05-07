package AutoTestWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class AppTest {

    private WebDriver driver;

    @Test
    public void myTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ranorex.com/web-testing-examples/vip/");

        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.click();
        firstNameField.sendKeys("Jenifer");
        firstNameField.clear();

        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.click();
        lastNameField.sendKeys("Aniston");
        lastNameField.clear();

        

        driver.navigate().refresh();
        driver.quit();

    }


}
