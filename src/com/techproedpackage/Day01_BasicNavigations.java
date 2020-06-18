package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    /*
    Yeni bir class oluşturun: class name ⇒ BasicNavigations
Create main method
System.setProperty(“”,””);
System.setProperty("webdriver.chrome.driver","/Users/techproed/Documents/selenium dependencies/drivers/chromedriver");//MAC
System.setProperty("webdriver.chrome.driver","C:\\Users\\techproed\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");//WINDOWS
 Chrome driver oluşturun
https://www.google.com/ adresinden google ana sayfasını açın.

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/administrator/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        //driver.get("https://www.amazon.com/");

        driver.navigate().to("https://www.amazon.com/"); //1. Aynı class ta, Navigate to amazon home page  https://www.amazon.com/
        driver.navigate().back(); //2. Navigate back to google (bir onceki sayfaya doner)
        driver.navigate().forward();  //3. Navigate forward to amazon (bir sonraki sayfaya gider)
        driver.navigate().refresh();  //4. Refresh(yenile) the web page
        driver.manage().window().maximize(); //5. Maximize the window
        driver.quit();//6. Close/Quit the browser



    }
}
