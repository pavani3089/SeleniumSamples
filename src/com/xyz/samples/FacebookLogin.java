package com.xyz.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by pavani on 6/28/17.
 */
public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        WebElement w1= driver.findElement(By.name("email"));
        w1.sendKeys("pavani3089@gmail.com");
        WebElement w2= driver.findElement(By.name("pass"));
        w2.sendKeys("testingqa");
        WebElement w3= driver.findElement(By.id("u_0_r"));
        w3.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
