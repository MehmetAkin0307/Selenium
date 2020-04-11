package Selenium_Automation;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class UpdateDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
      /*  int i=1;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }     */
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for (int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        /*driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("hrefIncAdt")).click();*/
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
