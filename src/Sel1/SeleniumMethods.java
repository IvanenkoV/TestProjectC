package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        get commands
//        ------------------
//                get() --> opens the URL on the browsers
//        getTitle() --> returns the page tile
//        getCurrentURL() -->returns the URL of the page
//        getPageSource() --> returns HTML code for page
//
//
//        Dropdown/combobox/list box
//                --------------------------
//        1) Find how many options present in drop down
//        dropdown.getOptions().size()
//
//        2) Extract all the options and print them
//        dropdown.getOptions()
//
//        3) Select option from the dropdown
//
//        dropdown.selectByvisibleText(option)
//        dropdown.selectByIndex(index)
//        dropdown.selectByValue(value)



//        Radio buttons/Checkboxs
//                ----------------
//        1) Check the status
//        2) Select option  - click()
//
//        Conditional Commands (Retirns a boolean value- true/false)
//        ----------------
//                isDisplayed()
//        isEnabled()
//        isSelected() // for radio buttons and check boxes


        WebElement radButton = driver.findElement(By.id("rad-1"));
        radButton.isEnabled(); // check enable or not, is boolean
        radButton.isDisplayed(); // check displayed or not, is boolean
        radButton.isSelected(); // check seklected or not, is boolean

        radButton.click();


        WebElement checkBoxq = driver.findElement(By.id("Chb-1"));

        checkBoxq.click();


        // Text area

        driver.findElement(By.id("TextArea1")).sendKeys("Any text");



//
//        Navigational commands
//        -------------------
//                navigate().to(URL) --> same as  driver.get()
//        navigate.back()
//        navigate.forward()
//        navigate.refresh()
//
//        browser commands
//        --------
//                close() --> close currently open browser(one browser)
//        quit() --> closes multiple browsers



        //     Links
        driver.findElement(By.linkText("some link text")).click();
        driver.findElement(By.partialLinkText("link text")).click();


        // FRAMES

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.switchTo().frame(0);


//        waits
//                -----
                Thread.sleep(3000); //3 cseconds
//
//        implicitWait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // sets one time at the beginning
//
//        explicitwait
        WebDriverWait mywait=new WebDriverWait(driver,10000);

        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName"))); // wait until will be visible element located  by name

        // The wait in such a way gives Web Element

        WebElement username =  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName"))); // wait until will be visible element located  by name
        username.sendKeys("Name1");



        //   Work with multiple links

        List <WebElement>  links = driver.findElements(By.tagName("a"));

        for (WebElement e: links) {

            System.out.println(e.getText());

        }


        //          Working with popup / alerts

        driver.switchTo().alert().accept(); //   close with ok button
        driver.switchTo().alert().dismiss(); // close with cansel button




        //            working with Frames


//        driver.switchTo().frame(name)

//        driver.switchTo().defaultContent(); //return to the page to see all frames
//        driver.switchTo().frame(index)
//        driver.switchTo().frame(WebElement)




//        Handle browser windows(switch between browser windows)
//                -----
//                handle --> an ID for a browser window
//
        String handleValue = driver.getWindowHandle(); //catche window ID
        System.out.println(handleValue);
        driver.switchTo().window(handleValue); // go to proper window
//        driver.getwindowsHandle()
//        driver.getwindowsHandles()



    }


}
