package Sel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDatePicker {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://goo.gl/RVdKM9");

        driver.manage().window().maximize();

        String year = "2018";
        String month = "November";
        String day = "18";


    }
}
