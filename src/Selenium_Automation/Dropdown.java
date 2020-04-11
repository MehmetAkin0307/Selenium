package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();
        /*Select s=new Select(driver.findElement(By.id("month")));
        s.selectByVisibleText("Apr");
        s.selectByValue("4");*/
        driver.findElement(By.id("month")).click();
       driver.findElement(By.linkText("Apr")).sendKeys(Keys.ENTER);




    }
}
