package Pages;

/**
 * Created by ataydjunusaliev on 9/19/17.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    WebDriver driver;
    WebDriverWait wait;




    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.wait = wait;
        wait = new WebDriverWait(driver, 10);
    }


}