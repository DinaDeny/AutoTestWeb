package AutoTestWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AppTest {
    private WebDriver driver;

    @Test
    public void myTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ranorex.com/web-testing-examples/vip/");

        WebElement FirstName = driver.findElement(By.id("First_Name"));
        WebElement LastName = driver.findElement(By.id("Last_Name"));


    }


}
