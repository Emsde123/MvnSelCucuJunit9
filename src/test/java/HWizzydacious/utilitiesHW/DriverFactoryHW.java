package HWizzydacious.utilitiesHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class DriverFactoryHW {
    private static WebDriver driver;

    public static WebDriver getDriver(){
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
        if(driver != null){
            driver.close();
            driver = null;
        }
    }
}
