package AutoTestWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class AppTest {

    private WebDriver driver;

    @BeforeClass
    public void innitDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.ranorex.com/web-testing-examples/vip/");
    }
    @Test
    public void myTest() {
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.click();
        firstNameField.sendKeys("Jenifer");
        firstNameField.clear();
        firstNameField.sendKeys("VeryLongTestFirstNameWithAnyCharacters1!@#$%^&*");
        firstNameField.clear();
    }
     @Test
     public void myTest1(){
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.click();
        lastNameField.sendKeys("Aniston");
        lastNameField.clear();
        lastNameField.sendKeys("VeryLongTestLastNameWithAnyCharacters1!@#$%^&*");
        lastNameField.clear();
        driver.navigate().refresh();
    }
        @Test
        public void myTest2() {

            WebElement Category = driver.findElement(By.id("Category"));
            Select select = new Select(Category);
            select.getAllSelectedOptions();
            select.getFirstSelectedOption();
            select.selectByValue("Science");

        }

        @Test
        public void myTest3(){
        WebElement Gender = driver.findElement(By.name("Gender"));
        WebElement value1 = driver.findElement(By.name("Female"));
        WebElement value2 = driver.findElement(By.name("Male"));
        value2.click();
    }

         @Test
         public void myTest4(){
         WebElement SaveButton = driver.findElement(By.id("Save"));
         Actions action = new Actions(driver);
         action.doubleClick(SaveButton);
        }

           @AfterClass
               public void tearDown() {
           driver.quit();
       }
    }




