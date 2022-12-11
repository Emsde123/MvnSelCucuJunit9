package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        // Here we're telling it not to create another driver if we already have one.
        // This allows us to run parallel tests without creating a new instance of the driver
        // for every test.
        if(driver == null){
            ChromeOptions capability = new ChromeOptions();
            capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
           driver = new ChromeDriver(capability);
        }
        return driver;
    }


    public static void closeDriver(){
        // closes the driver if it's not already null,
        // and then makes the driver null for the next instance.
        if(driver != null){
            driver.close();
            driver = null;
        }
    }


}
