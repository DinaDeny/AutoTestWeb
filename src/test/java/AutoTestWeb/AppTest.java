package AutoTestWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.w3c.dom.html.HTMLSelectElement;

import javax.swing.*;
import java.util.List;

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
        firstNameField.sendKeys("VeryLongTestFirstNameWithAnyCharacters1!@#$%^&*");
        firstNameField.clear();

        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.click();
        lastNameField.sendKeys("Aniston");
        firstNameField.clear();
        lastNameField.sendKeys("VeryLongTestLastNameWithAnyCharacters1!@#$%^&*");
        lastNameField.clear();

        WebElement Category = driver.findElement(By.id("Category"));
        Select select = new Select(Category);
        select.getAllSelectedOptions();
        select.getFirstSelectedOption();
        select.selectByValue("Science");

        WebElement SaveButton = driver.findElement(By.id("Save"));
        Actions action = new Actions (driver);
        action.doubleClick(SaveButton);


        driver.navigate().refresh();
        driver.quit();

    }


}
