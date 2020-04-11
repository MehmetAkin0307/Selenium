package Locators;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.Kernel;

public class VerifySearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("father day gifts");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys(Keys.ENTER);
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());

        WebElement input=driver.findElement(By.id("Locators/VerifySearch.java:21"));
        System.out.println(input.getAttribute("id"));
        System.out.println(input.getAttribute("class"));
        System.out.println(input.getAttribute("name"));



    }
}
