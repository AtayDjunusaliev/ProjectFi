package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ataydjunusaliev on 9/19/17.
 */
public class LoginValidTestCase {

    WebDriver driver;
    String baseURL;
    LoginPage loginPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://fi.google.com/about/";
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginValid() {
        driver.get(baseURL);
        String username = "testnova44@gmail.com";
        String password = "novatesting";
        loginPage.login(username, password);
        String Actual= driver.findElement(By.xpath("//div[@class ='N39BZd-r4nke']")).getText();
        System.out.println(Actual);
        String Expected = "Ready to join Project Fi?";
        Assert.assertEquals(Expected, Actual);
    }

}