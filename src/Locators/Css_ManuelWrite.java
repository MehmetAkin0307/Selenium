package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_ManuelWrite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Akif");
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("Erdal");
        //driver.findElement(By.cssSelector("input#Login")).click();
       // driver.findElement(By.cssSelector("#Login")).click();



    }
}
