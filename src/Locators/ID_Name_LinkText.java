package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID_Name_LinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/mehmetakin/Downloads/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.skyscanner.com");
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Houston");
        driver.findElement(By.name("fsc-destination-search")).sendKeys("Atlanta");
        driver.findElement(By.linkText("Search flights")).click();


    }
}
