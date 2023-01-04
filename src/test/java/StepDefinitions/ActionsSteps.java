package StepDefinitions;

import Pages.ActionsPage;
import Pages.HomePage;
import Utilities.DriverFactory;
import com.beust.ah.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsSteps {
    WebDriver driver = DriverFactory.getDriver();
    ActionsPage actionsPage = new ActionsPage(driver);
    HomePage homePage = new HomePage(driver);

    @Then("user should be able to navigate to System Users page by doing hover over action")
    public void user_should_be_able_to_navigate_to_System_Users_page_by_doing_hover_over_action() {
        Actions actionObj = new Actions(driver);
        actionObj.moveToElement(homePage.allMainTabs.get(0)).perform();
    }

    @Then("user should be able to handle context click on Context Menu Page")
    public void userShouldBeAbleToHandleContextClickOnContextMenuPage() throws InterruptedException {
        Actions act = new Actions(driver);

        // we are using the actions class here to allow us to right-click.
        // we need to pass actionsPage.rightClickMeBtn because we defined that element in our ActionsPage.
        act.contextClick(actionsPage.rightClickMeBtn).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        Thread.sleep(3000);

        /* switch and handle the alert */
        Alert alert = driver.switchTo().alert();
        //TODO Hint for HW: Retrieve expected values from Examples section of Scenario Outline
        String expectedAlertTxt = "clicked: edit";
        String actualAlertTxt = alert.getText();
        Assert.assertEquals("The alert text verification has failed!", expectedAlertTxt, actualAlertTxt);
        alert.accept();
    }

    @Given("user navigates to Context Menu Page")
    public void userNavigatesToContextMenuPage() throws InterruptedException {
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        Thread.sleep(3000);
    }

    @Given("user navigates to Drag and Drop practice page")
    public void user_navigates_to_Drag_and_Drop_practice_page() throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(3000);
    }

    @Then("user should be able to perform drag and drop action on Drag and Drop Page")
    public void user_should_be_able_to_perform_drag_and_drop_action_on_Drag_and_Drop_Page() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("box3"));
        WebElement target = driver.findElement(By.id("box103"));
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
        //TODO Hint for HW: retrieve expected values from Examples section of Scenario Outline
        String backgroundColorCode = source.getCssValue("background-color");
        System.out.println("Code color for Washington is: " + backgroundColorCode);
        Assert.assertTrue("RGB color validation has failed!", source.getCssValue("background-color").contains("0, 255, 0"));

    }

}
