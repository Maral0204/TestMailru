import dataProviders.ConfigReader;
import driverFactory.Driver;
import helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.UserPage;

/**
 * @author Maral Dyushekeeva
 */
public abstract class BaseTest {
public LoginPage loginPage;
public UserPage userPage;
public WebDriver driver;

public WebElementActions actions;



    @BeforeClass
    public void setUpUiTest() {
        loginPage =new LoginPage();
        userPage =new UserPage();
        actions = new WebElementActions();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("url"));


    }

    @AfterClass
    public void tearDown() { Driver.closeDriver();
    }
}
