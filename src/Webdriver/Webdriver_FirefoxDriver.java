package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_FirefoxDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/mehmetakin/Downloads/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.navigate().to("http://www.yahoo.com");
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
