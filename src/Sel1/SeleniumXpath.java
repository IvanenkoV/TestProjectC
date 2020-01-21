package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {

    public static void main(String[] args) {



            System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            // CSS Selector tag input id=email   # - mean ID




//
//        Relative XPath(Partial XPath)
////*[@id="email"]/input/td[1]/......
//
//
//        Xpath functions
//        -----------
//                1) text()
//        2) contains()
//        3) starts-with()
//
//
//        preceding
//                ---------
////input[@id='u_0_v']//preceding::input[4]

                driver.findElement(By.xpath("//*[@id='email']")).sendKeys("some value");
    }
}
