package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        WebElement source=driver.findElement(By.id("fromCity"));
       // driver.findElement(By.id("fromCity")).clear();//burda hata veriyor
        source.clear();
       // driver.findElement(By.id("fromCity")).sendKeys("MUM");
        source.sendKeys("MUM");
        Thread.sleep(2000);
        //driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
        source.sendKeys(Keys.ENTER);
        WebElement destination=driver.findElement(By.id("toCity"));
        destination.clear();
        destination.sendKeys("DEL");
        Thread.sleep(2000);
        destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);
    }
}
