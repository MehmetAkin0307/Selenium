package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com/");
        // xpath =//a[@value='MAA']      xpath =//a[@value='BLR']
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR'] ")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click(); // + [2] ?
    }
}
