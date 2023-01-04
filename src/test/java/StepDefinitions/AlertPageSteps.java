package StepDefinitions;

import Pages.AlertPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AlertPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    AlertPage alertPage = new AlertPage(driver);
    @Given("user navigates to Alerts Page")
    public void userNavigatesToAlertsPage() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user clicks on regular alert on Alerts Page")
    public void userClicksOnRegularAlertOnAlertsPage() throws InterruptedException {
        Thread.sleep(2000);
        alertPage.regularAlertBtn.click();
    }

    @Then("user should be able to handle regular alert on Alerts Page")
    public void userShouldBeAbleToHandleRegularAlertOnAlertsPage() {
        Alert myAlert = driver.switchTo().alert();
        myAlert.accept();
    }
}
