package com.xyz.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by pavani on 7/2/17.
 */
public class EbayDeals {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        Thread.sleep(2000);
        WebElement deals = driver.findElement(By.partialLinkText("Daily Deals"));
        deals.click();

        List<WebElement> featured = driver.findElements(By.xpath("//div[@class='ebayui-dne-item-featured-card']//div[@class='dne-itemtile dne-itemtile-medium']//div[@class='dne-itemtile-detail']/h3/span"));
        for (WebElement fd: featured) {

            System.out.print("Title= "+fd.getText());


            WebElement k=fd.findElement(By.xpath("../../div[@class='dne-itemtile-price']/span[@itemprop='price']"));
            if(k.isDisplayed()) {
                System.out.print("--->" + k.getText());
                System.out.println();
            }

        }

        driver.quit();
    }
}
