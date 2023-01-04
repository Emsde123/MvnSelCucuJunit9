package FrameworkBasics;

public class JavascriptExecutor {

    // A Javascript is small chunks of a program that makes a website interactive.
    // it can change the content of the HTML page dynamically

    // Javascript can listen to everything on the web page like reacting to a click on a button,
    // reacting when clicking on a checkbox, or when we enter any value into the text bar

    // We need Javascript Executor to run javascript code in selenium

    // Javascript executor allows you to run puire Javascript code irrespective of the Selenium language
    // (python, java, ruby, etc.)



    //          JAVASCRIPT EXECUTOR
    //  - We should only go for Javascript executor when we are not able to perform a particular
    //    task with our Selenium (Like not being able to click on an element)
    //                  - javascriptexecutor is modifying element attributes to get us what we need

    //  - Normally if a button is not clickable we shouldn't force a way to click it.
    //          - but in some cases, we know that button is clickable it's just that Selenium can't click it.
    //            that's when we will use it.

    //   - There are 2 abstract methods present in JS executor
    //          - executeScript()  <-- will mostly use this method
    //          - executeAsyncScript()



    //             JAVASCRIPTEXECUTOR CLICK
    //      There are several options we can do with the help of JS Executor

    //      - Click an element
    //              - WebElement button = driver.findElement(By.id"XXX"));
    //              - JavascriptExecutor js = (JavascriptExecutor)driver;
    //              - js.executeScript("arguments[0].click();", button);
    //       - This click is mostly used in places where normal .click() method is not working.
    //       - It is effective, can click on buttons that aren't visible on the screen without scrolling.
    //                  - Regular Selenium isnt able to handle such elements, and will throw exception ElementNotClickable.


    //              JAVASCRIPT SCROLL
    //      We can also scroll the web page using JS Executor.

    //  - To scroll to a specific element:
    //          - js.executeScript("arguments[0].scrollIntoView(true);", element);
    //  - To scroll to the end of the page:
    //          - js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

}
