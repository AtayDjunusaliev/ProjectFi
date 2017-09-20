package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ataydjunusaliev on 9/19/17.
 */
public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {

        super(driver);
    }

    By SignInButton = By.xpath("//paper-button[@class = 'plain account gtm-account-header x-scope paper-button-0']");
    By Username = By.name("identifier");
    By NextButtonUsername = By.xpath(".//*[@id='identifierNext']/content/span");
    By Password = By.xpath("//input [@class ='whsOnd zHQkBf']");
    By NextButtonPassword = By.xpath("//div[@id ='passwordNext']");



    public void login(String username, String password){

        driver.findElement(SignInButton).click();
        driver.findElement(Username).sendKeys(username);
        driver.findElement(NextButtonUsername).click();
        sleep(4);
        driver.findElement(Password).sendKeys(password);
       driver.findElement(NextButtonPassword).click();


    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
