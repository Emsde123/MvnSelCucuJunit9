package StepDefinitions;

import Pages.LoginPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPageSteps {

    // We instantiated the driver from the DriverFactory class, and grabbed it.
    // Then we pass the driver we grabbed into the loginPage instantiation
    // where it's passed into the parameterized constructor.
     WebDriver driver = DriverFactory.getDriver();
     LoginPage loginPage = new LoginPage(driver);

    String password = "Bootcamp5#";
    String username = "yoll-student";

    // @Given("xxxx")  <- GLUE
    @Given("user navigates to HRM Login Page")
    public void user_navigates_to_HRM_Login_Page() throws InterruptedException {
        driver.get("https://dev-hrm.yoll.io/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginBtn));
        loginPage.loginBtn.click();
    }





//-------------------------------------------------------------------------------------------------------------------------------

    // PARAMETRIZING TEST STEPS
    @When("user enters {string} username")
    public void user_enters_username(String username) {
       loginPage.usernameField.sendKeys(username);
    }

//-------------------------------------------------------------------------------------------------------------------------------


    // PARAMETRIZING TEST STEPS
    @Then("user enters {string} password")
    public void user_enters_password(String password) {
     loginPage.passwordField.sendKeys(password);
    }

//-------------------------------------------------------------------------------------------------------------------------------

    @Then("user validates {string} error message")
    public void user_validates_error_message(String expectedErrorMessage) {
        String actualErrorMessage =  loginPage.errorMessage.getText();
        Assert.assertEquals("Error message validation has failed", expectedErrorMessage, actualErrorMessage);
    }



//    @Then("user validates Password cannot be empty error message")
//    public void user_validates_Password_cannot_be_empty_error_message() {
//        String expectedErrorMessage = "Password cannot be empty";
//        String actualErrorMessage =  loginPage.errorMessage.getText();
//        Assert.assertEquals("Error message validation has failed", expectedErrorMessage, actualErrorMessage);
//    }
//
//    @Then("user validates Username cannot be empty error message")
//    public void user_validates_Username_cannot_be_empty_error_message() {
//        String expectedErrorMessage = "Username cannot be empty";
//        String actualErrorMessage =  loginPage.errorMessage.getText();
//        Assert.assertEquals("Error message validation has failed", expectedErrorMessage, actualErrorMessage);
//    }
//
//    @Then("user validates invalid credentials error message")
//    public void user_validates_invalid_credentials_error_message() {
//        String expectedErrorMessage = "Invalid credentials";
//        String actualErrorMessage =  loginPage.errorMessage.getText();
//        Assert.assertEquals("Error message validation has failed", expectedErrorMessage, actualErrorMessage);
//
//    }



}
