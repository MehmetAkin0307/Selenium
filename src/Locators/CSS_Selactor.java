package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selactor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("email adress");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();


    }
}
