package com.xyz.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

/**
 * Created by pavani on 7/2/17.
 */
public class RetailMeNot {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.retailmenot.com");
        Thread.sleep(5000);
        Set<String> handle= driver.getWindowHandles();//Return a set of window handle

        for(String hadle1:handle)
        {
            System.out.println(hadle1);
        }

        WebElement browse = driver.findElement(By.partialLinkText("Browse Deals") );
        browse.click();
        Thread.sleep(2000);
        WebElement productDeals = driver.findElement(By.partialLinkText("Product Deals"));
        productDeals.click();
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
        List<WebElement> num = driver.findElements(By.xpath("//section[@id='Electronics']//h6[@class='h6 coupon-product-title js-title']"));

        System.out.println(num.size());
        for (WebElement w:num) {

    String s=w.getText();

    System.out.println("Title: "+s);
    System.out.println();

        }
    }
}
