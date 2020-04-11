package Synchroniz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchroniz {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mehmetakin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tab-hotel-tab-hp > span.icons-container > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hotel-destination-hp-hotel ")).sendKeys("nbc");//BURDA HATA VERIYOR
        Thread.sleep(2000);
        driver.findElement(By.id("hotel-destination-hp-hotel ")).sendKeys(Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(Keys.ENTER);

        // TAMAMLANMADI

    }
}
