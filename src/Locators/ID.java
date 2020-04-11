package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.MBeanAttributeInfo;

public class ID {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.linkText("Forgot account?")).click();


    }


}

