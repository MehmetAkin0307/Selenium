package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Css_Contains {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        //driver.findElement(By.cssSelector("a[href*='https://mail.rediff.com/cgi-bin/login.cgi']")).click();
        //driver.findElement(By.cssSelector("a[title*='Already a user? Sign in']")).click();
        //driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.cssSelector("a[title*='Already a user? ']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
        //driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
        driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
    }
}
