package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {
    //1. Yeni bir class oluşturun : VerifyURLTest
    //	(URLDoğrulamaTesti)
    //2. Navigate to google homepage
    //3. Google ana sayfa URL'sinin “www.google.com” olduğunu doğrulayın(verify)

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/administrator/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";
        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL URL : " + actualURL);
            System.out.println("EXPECTED URL : "+expectedURL);
        }
    }
}
