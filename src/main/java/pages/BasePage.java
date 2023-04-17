package pages;

import driverFactory.Driver;
import helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Maral Dyushekeeva
 */
public class BasePage {
    public WebElementActions elementActions;
    public WebDriver driver;
    public BasePage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
