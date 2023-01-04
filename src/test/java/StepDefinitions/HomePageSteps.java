package StepDefinitions;
import java.util.Map;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class HomePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);


    // Even though this belongs to HomePageSteps we can call it and use it from any feature file
    @Then("user should be able to verify account name on HRM homepage")
    public void user_should_be_able_to_verify_account_name_on_HRM_homepage() {
        String expectedUsername = "Welcome yoll";
        String actualUsername   = homePage.usernameHeader.getText();
        Assert.assertEquals("Username header verification failed!",
                expectedUsername, actualUsername);
    }

    @And("user verifies main tabs on HRM Homepage")
    public void user_Verifies_Main_Tabs_On_HRM_Homepage(DataTable dataTable) {
        //                                                String.class says to save the data to String class. That's it.
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        // each element will be returned as key value format, so we need to copy and paste
        // the same format we used for the map above.

        // We are getting the key and value for each main tab, it looks like below.
        // KEY: tabname
        // VALUE: Admin
        int i = 0;
        for(Map<String, String> eachElement : maps ){
        String expectedTabName = eachElement.get("tabname");
        String actualTabName   = homePage.allMainTabs.get(i).getText();
        i++;
        Assert.assertEquals("tabname verification failed!",
                expectedTabName, actualTabName);
        }

    }




}
