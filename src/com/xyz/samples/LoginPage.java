package com.xyz.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by pavani on 6/28/17.
 */
public class LoginPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        String s=driver.getTitle();
        System.out.println(s);
        if(s.equals("Facebook - Log In or Sign Up"))
        {
            System.out.println("Test case Passed");
        }
        driver.quit();



    }
}
