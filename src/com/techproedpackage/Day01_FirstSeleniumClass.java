package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/administrator/Documents/selenium libraries/drivers/chromedriver");
    //driver olusturduk
    WebDriver driver = new ChromeDriver();
    // url ile google a gittik
    driver.get("https://www.google.com/");

    Thread.sleep(3000); // sayfa acildiktan sonra kapatmak icin gececek sure

          // close() ve quit() her iki method da tarayiciyi kapatir.
        //close() ==> mevcut sayfayi kapatir
        // quit() acilan tum sayfalari kapatir. daha guclu
    driver.quit();

    }
}
