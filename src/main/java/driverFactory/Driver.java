package driverFactory;

import dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;
/**
 * @author Maral Dyushekeeva
 */
public class Driver {

    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                    default:
                        driver = EdgeWebDriver.loadEdgeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }


}
