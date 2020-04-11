package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_ChromeDriver {
    public static void main(String[] args) {
  // create driver object for chrome browser
  // we will strictly implement methods of webdriver
  /* class name=x  x driver=new x();
  class name=Chrome driver
   */
  /*
  This .exe file is nothing but browser driver file which we discussed in web driver architecture lecture
   */
  // invoke .exe file first


        System.setProperty("webdriver.chrome.driver","/Users/mehmetakin/Downloads/chromedriver");
       WebDriver driver= new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        //driver.get("http://www.yahoo.com");
        driver.navigate().to("http://www.bestbuy.com");
        driver.navigate().back();
        driver.close();//kapatiyor


    }
}

