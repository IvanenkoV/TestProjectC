package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadDownload {

    public static void main(String[] args) throws InterruptedException, FindFailed {

        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        firefox
//        System.setProperty("webdriver.gecko.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//geckodriver-v0.26.0-win32//geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();


        driver.manage().window().maximize();

        driver.get("http://demo.automationtesting.in/Register.html");

        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='imagesrc']"))));


        driver.findElement(By.xpath("//*[@id='imagesrc']")).click();

        String imagesFilepath="D:\\УЧЕБА\\CucumberTesrtNG\\18\\ClassExamples\\ClassExamples\\FileUpload_using_Sikuli\\Fruites\\";
        String inputFilepath="D:\\УЧЕБА\\CucumberTesrtNG\\18\\ClassExamples\\ClassExamples\\FileUpload_using_Sikuli\\Fruites\\inputfiles\\";

        Screen s = new Screen();

        Pattern fileInputTextBox = new Pattern(imagesFilepath + "FileTextBox.PNG");
        Pattern openButton = new Pattern(imagesFilepath + "OpenButton.PNG");

        Thread.sleep(5000);

        s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox,inputFilepath+"apple.jpg");
        s.click(openButton);




    }
}
