package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");
      driver.findElement(By.id("username")).sendKeys("Musa");
      driver.findElement(By.name("pw")).sendKeys("Erdal");
      driver.findElement(By.xpath("//*[@id='Login']")).click();
    }
}
