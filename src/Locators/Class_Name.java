package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Name {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        driver.findElement(By.id("Login")).click();

    }
}
