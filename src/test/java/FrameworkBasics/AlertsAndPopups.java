package FrameworkBasics;

public class AlertsAndPopups {

    // Alerts come from the browser, not the application. Because of this there is not representation
    // for the alert in the HTML structure, we can't locate it.

    // Selenium allows us to handle alerts/popups without directly locating the element (because it's not possible)
    // If we don't handle the alert, we will get UnhandledAlertException, and the test will exit.

    // We can use ExplicitWait / WebDriverWait to check weather the alert is there or not.
    // wait.until(ExpectedConditions.alertIsPresent());


    //      HANDLING ALERTS
    // Alert myAlert = driver.switchTo().alert();
    // by calling switchTo() method we give control of Selenium from HTML to alert popup.
    // There are 4 actions we can do with Alerts:
    // - myAlert.accept();  <- OK
    // - myAlert.dismiss(); <- Cancel
    // - myAlert.getText(); <- Gets the alert text
    // - myAlert.sendKeys("keys to send") <- types into prompt


}
