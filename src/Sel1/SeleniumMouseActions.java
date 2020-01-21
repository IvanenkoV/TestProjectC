package Sel1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseActions {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        //login

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(3000);

        //Admin-->Usermanagement-->Users

        WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
        WebElement usermgnt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
        WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));

        //  Moving mouse pointer   moveToElement()
       // Create an action to move the mouse pointer from one to one element and then click and perform build
        Actions act=new Actions(driver);

        act.moveToElement(admin).moveToElement(usermgnt).moveToElement(users).click().build().perform();





        //Right click

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions act1=new Actions(driver);

        WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

        act1.contextClick(button).build().perform(); //Right click on button

        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();

        Thread.sleep(5000);

        Alert alert=driver.switchTo().alert();

        System.out.println("Text present on alert window is:" +alert.getText());
        alert.accept(); // this closes alert window

        // double click
        //act.doubleClick(button).click().build().perform();



        // Drug and drop

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");



        WebElement source_element=driver.findElement(By.id("box6")); //Italy - source element

        WebElement target_element=driver.findElement(By.id("box106"));//Rome -target element

        Actions act2=new Actions(driver);

        Thread.sleep(5000);

        act2.dragAndDrop(source_element, target_element).build().perform(); //Drag and drop


        //  Resizing

        driver.get("https://jqueryui.com/resizable/");



        driver.switchTo().frame(0); //switch to frame

        WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

        Thread.sleep(3000);

        Actions act3=new Actions(driver);

        act3.moveToElement(element).dragAndDropBy(element,200, 150).build().perform(); //resizing



        //  Moving slider

        driver.get("https://jqueryui.com/slider/");



        driver.switchTo().frame(0);

        WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

        Thread.sleep(3000);

        Actions act4=new Actions(driver);

        act4.moveToElement(slider).dragAndDropBy(slider,400, 0).build().perform(); //moving the slider


    }
}
