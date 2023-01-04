package FrameworkBasics;

public class FramesAndIFrames {
    // When dealing with iFrames you will need to switch over control with Selenium, just like with alerts.
    // If we don't switch we'll get NoSuchElementException, because the element isn't located
    // in the main HTML, it's located in HTML for iFrame.

    // You wont be able to interact with items inside frames unless you switch control.
    // It's like a second HTML structure you need to switch over to.

    // Frame <- Is an HTML tag and is used to divide the same page into various frames/windows.

    // iFrame <- (inline frame)


    // Switching to iFrames
    // There are 3 ways to switch controls:
    // By index -> driver.switchTo().frame(0);
    //              since the order of frames can change, it's not the best way.
    // By name or ID -> driver.switchTo().frame("customIframe");
    //              if these attributes aren't present we can't do this.
    // By webelement -> WebElement testFrame = driver.findElement(By.xpath("xpathExample");
    //                  driver.switchTo().frame(testFrame);

    // After switching to iFrame we will have to switch back to the main HTML if we want to continue outside the iFrame.
    // That has to do with nested iFrames, we'll talk about it below.

    // NESTED IFRAMES
    // In order to access the content in a nested iFrame, we have to switch to the outer frame first, and then go inside
    // to the nested frame.
    // Also, if there are seperate iFrames, and inside each iFrame is a nested iFrame we have to switch back to main
    // and then go to the iFrame we want.

    // switching to outer iFrame first and then the nested frame.
    // driver.switchTo().frame("iFrame2");
    // driver.switchTo().frame("iFrame1");

    // Also, child frames can't switch between eachother, they need to go up to the parent and then go back to the sibling.

}
