package StepDefinitions;
import Pages.iFramePage;
import Utilities.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class iFramePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    iFramePage iFramePage = new iFramePage(driver);

    @Given("user navigates to iFrames page")
    public void user_navigates_to_iFrames_page() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user enters a keyword into the text box on iFrames page")
    public void user_enters_a_keyword_into_the_text_box_on_iFrames_page() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame(iFramePage.iFrameMenu);
        iFramePage.editorTextBox.clear();
        Thread.sleep(2000);
        iFramePage.editorTextBox.sendKeys("I literally just pooped in my pants and I can't see anything.");
    }

    @Then("user should be able to verify the entered text on iFrames page")
    public void user_should_be_able_to_verify_the_entered_text_on_iFrames_page() {



    }
}
