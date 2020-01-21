package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class DataDravenTestingViaDatabase {

    public static void main(String[] args) throws SQLException {

        System.setProperty("webdriver.chrome.driver", "D://УЧЕБА//CucumberTesrtNG//WebDRIVER//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/");

        //step1
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestBase?serverTimezone=UTC", "VVV","trinitron");


        //step2
        Statement stmt=con.createStatement();

        //Step3 & step4 : Creation and executio of query
        String s="select * From users";
        ResultSet rs=stmt.executeQuery(s);

        while(rs.next())
        {
            String uname=rs.getString("USERNAME");
            String pwd=rs.getString("PASSWD");

            driver.findElement(By.name("userName")).sendKeys(uname);
            driver.findElement(By.name("password")).sendKeys(pwd);
            driver.findElement(By.name("login")).click();

            if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
            {
                System.out.println("passed");
            }
            else
            {
                System.out.println("failed");
            }

            driver.findElement(By.linkText("Home")).click();
        }

        //step5
        rs.close();
        con.close();

    }
}
