import dataProviders.ConfigReader;
import jdk.jfr.Description;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;
/**
 * @author Maral Dyushekeeva
 */
public class SendMessageTest extends BaseTest {

    @Test
    @Description("Verify email sending")

    public void sendMessage() {
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame(loginPage.framePage);
        actions.sendKeys(loginPage.inputUsername, ConfigReader.getProperty("userName"))
                .click(loginPage.passwordBtn);
        actions.sendKeys(loginPage.inputPassword, ConfigReader.getProperty("password"))
                .click(loginPage.sighInBtn);

//        driver.switchTo().defaultContent();
//
//        String currentWindow = driver.getWindowHandle();
//        actions.click(userPage.theWriteALetterBtn);
//
//        Set<String> allWindows = driver.getWindowHandles();
//        String newWindow = "";
//        for (String windowHandle : allWindows) {
//            if (!windowHandle.equals(currentWindow)) {
//                newWindow = windowHandle;
//                break;
//            }
//        }
//
//        driver.switchTo().window(newWindow);
//
//        actions.sendKeys(userPage.enterSendTo, "arni200815@gmail.com")
//                .sendKeys(userPage.enterTheTopic, "Test message")
//                .sendKeys(userPage.inputMessage, "Hi! Have a good day!");
//                .click(userPage.sendBtn);

//        Assert.assertTrue(userPage.sendMessage.isDisplayed());

    }
}
