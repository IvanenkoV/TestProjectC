package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDay11 {

    //Open browser
    public static void main(String[] args) {
        //Chrome
//        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

            //firefox
//        System.setProperty("webdriver.gecko.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//geckodriver-v0.26.0-win32//geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.ie.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//IEDriverServer_Win32_3.150.1//IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

      //go to page
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin"); // or driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            //click
        driver.findElement(By.name("Submit")).click();
        //get title
        String actTitle = driver.getTitle();
        String expTitle = "OrangeHRM";

        //Verify

        if (expTitle.equals(actTitle)){
            System.out.println("Test passed");
        }
        else System.out.println("Test failed");


        //close broser
        driver.close(); //or         driver.quit(); //close all open tabs

    }

}
