package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Maral Dyushekeeva
 */
public class UserPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Написать письмо')]")
    public WebElement theWriteALetterBtn;

    @FindBy(xpath = "//input[@style='width: 12px;']")
    public WebElement enterSendTo;

    @FindBy(xpath = "//input[@name='Subject']")
    public WebElement enterTheTopic;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement inputMessage;

    @FindBy(xpath = "//span[contains(text(),'Отправить')]")
    public WebElement sendBtn;

    @FindBy(xpath = "//a[@class='layer__link']")
    public WebElement sendMessage;


}
