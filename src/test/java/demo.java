import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class demo {
    public WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.id("login-button"));
        button.click();
        WebElement button1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        button1.click();
        WebElement button2 = driver.findElement(By.id("shopping_cart_container"));
        button2.click();
        WebElement checkaut = driver.findElement(By.id("checkout"));
        checkaut.click();
        WebElement name = driver.findElement(By.id("first-name"));
        name.sendKeys("mmmm");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("vvvvv");
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("123");
        WebElement continu = driver.findElement(By.id("continue"));
        continu.click();
        WebElement finish = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]"));
        finish.click();


    }

    @BeforeClass
    public void beforeClass2() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass
    public void afterClas() {
        driver.quit();
    }


}
