package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCSSSelectors {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // CSS Selector tag input id=email   # - mean ID
        driver.findElement(By.cssSelector("input#email")).sendKeys("x@gmail.com");


        // CSS Selector tag input class=inputText    . - mean class
        driver.findElement(By.cssSelector("input.inputText")).sendKeys("x@gmail.com");

        // CSS Selector tag input   any atribute [atribut=value ]
        driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("x@gmail.com");


        // CSS Selector tag input class=inputText    . - mean class AND any atribute [atribut=value ]
        driver.findElement(By.cssSelector("input.inputText[name=lastName]")).sendKeys("x@gmail.com");

    }
}
