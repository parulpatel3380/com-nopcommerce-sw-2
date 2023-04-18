package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/ ";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void LoginTest() {
        //Relative path
        driver.findElement(By.id("Email")).sendKeys("abcdefg@gmail.com");
        //find password
        driver.findElement(By.name("Password")).sendKeys("AimHigh123");

        WebElement loginBoton = driver.findElement(By.xpath(""));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
