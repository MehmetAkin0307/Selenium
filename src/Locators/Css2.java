package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());



    }
}