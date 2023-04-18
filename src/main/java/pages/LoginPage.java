package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Maral Dyushekeeva
 */
public class LoginPage extends BasePage {


    @FindBy (xpath = "//button[@data-testid='enter-mail-primary']")
    public WebElement loginBtn;

    @FindBy (xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
    public WebElement framePage;

    @FindBy (xpath = "//input[@autocomplete='username']")
    public WebElement inputUsername;

    @FindBy (xpath = "//span[contains(text(),'Enter password')]")
    public WebElement passwordBtn;


    @FindBy (xpath ="//input[@placeholder='Password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@data-test-id='submit-button']")
    public WebElement sighInBtn;

}

