package FrameworkBasics;

public class Waits {

    // The process of waiting is synchronizing the webdriver with the application.

    // There are several types of waits:
    //      ImplicitWait
    //      ExplicitWait
    //      FluentWait


    // ImplicitWait
    //    -  ImplicitWait is a time limit we provide for Selenium to wait before throwing
    //       ElementNotFoundException
    //    - It is dynamic
    //    - If we tell it to wait 10 seconds, but all the elements are loaded in 5 it will skip the last 5 seconds.
    //      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS)
    //    - One thing to note is that implicit wait does not pertain to a single element, it's a line concerning
    //      The whole page. It's saying to wait for everything to get loaded.
    //    - Since it's not element specific, we can set it where we instantiate our driver.

    // There are limitations that come with implicitwait.
    //  - It's set only once and lasts for the entire duration of the webdriver.
    //  - What if some elements take longer to load?
    //  - What if it's okay for some elements to load in 5 seconds, while it's not acceptable for others?



    // ExplicitWait
    //  - It's the most recommended wait when dealing with web elements.
    //  - It will tell webdriver to wait for a specific condition, or the max time limit before throwing exception.
    //  - It deals with one element at a time, we need to specify what element to wait for.
    //  - It has nice benefits, we can choose what element to wait for, and for which condition.
    //  - We have to use it with ExpectedConditions class which will give us conditions to choose from.
    //          Wait wait = new WebDriverWait(driver, 10);
    //         - wait is an interface, WebDriverWait is a class that implements it

    // ExplicitWait conditions
    // presenceOfElementLocated
    //      - Checks the DOM to see if it can locate an element
    // visibilityOfElementLocated
    //      - Checks to see if element is present and also visible (height and width greater than 0 px)
    // elementToBeClickable
    //      - waits for the element to be clickable.
    // elementToBeSelected
    //      - waits for elements to be selecte
    // textToBePresentInElementLocated()
    //      - waits for an element to have particular text
    // alertIsPresent()
    //      - waits for an alert to be present


    // ImplicitWait is better to use when all elements can be loaded in the same timeframe
    // ImplicitWait is applied to all elements in the driver
    // ExplicitWait is dependent on individual elements, and we can use conditions.

    // FluentWait
    // The difference in fluentWait is that we can specify how often Selenium checks back on weather the
    // condition is met.
    // Syntax:
    // Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
    //  .withTimeout(Duration.ofSeconds(10)) <- Time before timeout
    //  .pollingEvery(Duration.ofMilis(60))  <- how often condition is checked
    //  .ignoring(NoSuchElementException.class) <- what to ignore while we're getting exceptions thrown.

}
