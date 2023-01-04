package Pages;

import Utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActionsPage {
    WebDriver driver = DriverFactory.getDriver();
    public ActionsPage(WebDriver driver) {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath="//*[@class='context-menu-one btn btn-neutral']")
    public WebElement rightClickMeBtn;


    @FindBy(xpath = "//*[@class='context-menu-list context-menu-root']/li/span")
    public List<WebElement> allContextOptions;



}
