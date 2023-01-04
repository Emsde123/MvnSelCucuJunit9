package FrameworkBasics;

public class WindowsAndTabs {

    // SOmetimes when we click on a link it opens a new window or tab,
    // in order to interact with any element on that new window/tab we have to switch control to it.
    // Tabs and Windows are treated THE SAME in Selenium.

    // Tabs and windows act like elements with parents, child, grand-children, etc.
    // The starting tab/window is the PARENT
    // If you open a window or a tab from PARENT then it's the CHILD, you can have multiple child tab/windows coming
    // from one PARENT.


    //          SWITCHING TO WINDOW
    // Every OS will generate a unique GU ID so each tab/window can be identified.
    // GU ID is a numeric String value. Eg: 25445433

    //          GRABBING MAIN GU ID
    // Since the main window also has a GU ID we can grab it, like so:
    // String mainGUID = driver.getWindowHandle();

    //          GET ALL GU ID OF OPEN WINDOWS
    // We can also get window handles of all windows and tabs that have been opened by Selenium, like so:
    // Set allGUIDS = driver.getWindowHandles();
    // Notice how we use Set datatype for that, no duplicate values and no NULL.

    //           SWITCHING TO SPECIFIC WINDOW BY GUID
    //      driver.switchTo().window(guid);

    //            CLOSING WINDOW AND PASSING CONTROL TO MAIN
    //      driver.close();         <-- closes current window
    //      driver.switchTo().window(mainGUID);



    //          SWITCH TO WINDOW
    /*  Below we wrote a for each loop that stores each GUID in a String
    //  We set a condition that if the title of the page contains CNN
    //  Then we will go inside the page, look for a specific element and enter a name.


    * for(String guid : allGUIDs){
    *       driver.switchTo().window(guid);
    *       if(driver.getTitle().toLowerCase().contains("cnn")){
    *       driver.findElement(By.id("dsk")).sendKeys("Micheal");
    *       break;
    *   }
    *
    * }
    */





}
