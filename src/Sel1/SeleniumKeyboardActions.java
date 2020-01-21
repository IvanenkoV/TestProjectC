package Sel1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumKeyboardActions {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/key_presses");

        driver.manage().window().maximize();

        Thread.sleep(5000);


        // Keyboard actiions
        Actions act=new Actions(driver);

        act.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(3000);

        act.sendKeys(Keys.ESCAPE).build().perform();

        Thread.sleep(3000);

        act.sendKeys(Keys.SPACE).build().perform();

        Thread.sleep(3000);

        act.sendKeys(Keys.DELETE).build().perform();

        // Multiple Key
        act.sendKeys(Keys.CONTROL+"a").build().perform();



    }
    }
