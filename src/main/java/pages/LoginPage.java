package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Maral Dyushekeeva
 */
public class LoginPage extends BasePage {

    @FindBy (xpath = "(//button[text()='Войти'])[2]")
    public WebElement loginBtn;

    @FindBy (xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
    public WebElement framePage;

    @FindBy (xpath = "//input[@placeholder='Account name']")
    public WebElement inputUsername;

    @FindBy (xpath = "//span[contains(text(),'Enter password')]")
    public WebElement passwordBtn;

    @FindBy (xpath ="//input[@placeholder='Password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement sighInBtn;

}

