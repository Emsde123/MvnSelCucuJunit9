package FrameworkBasics;

public class ActionClass {
    // There are specific actions that we can only do with mouse and keyboard
    // For example on Amazon.com there are tabs that you need to hover over in order to interact with them.
    // We need to use the Action class if we want to interact with those types of elements,
    // because regular click won't work on those type of elements.


    // The action class allows us to build a chain of actions that we want to perform.
    // for example, pressing shift key and type something and then release, or if we want to
    // check multiple check boxes we can press CTRL and then click all the required boxes.

    // 1. First we create an object of Action class
    //      Actions act = new Actions(driver);
    // 2. Then we call methods of Actions using the object we created
    // 3. Mouse actions:
    //          build(), click(), clickAndHold(), contextClick(), doubleClick(), dragAndDrop(),
    //          moveToElement(), perform(), release()
    // 4. Keyboard Actions:
    //          sendKeys(), keyUp(), keyDown()

    //  HOVER OVER
    // Action act = new Action(driver);
    // act.moveToElement(elem).perform();
    // we used perform, because it will execute the action of moveToElement().
    // we will use perform() method after any method we use from Action class so that it will execute.


    // RIGHT CLICK
    //      In order to right-click an element or webpage we can use contextClick() method
    //      Actions act = new Actions(driver);
    //      act.contextClick(element).perform();

    // DRAG & DROP
    //      If we want to drag and drop an element we would use dragAndDrop() method
    //      Actions act = new Actions(driver);
    //      WebElement source = driver.findElement(By.xpath("//tng");
    //      WebElement target = driver.findElement(By.id("div2");
    //      act.dragAndDrop(source, target).perform();





}

