package com.xyz.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by pavani on 7/1/17.
 */
public class Guru99Ex {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.guru99.com/");
        List<WebElement> headings=driver.findElements(By.xpath("//div[@class='featured-box']/h4/b"));

        for(WebElement w:headings)

        {
            String eachHeadings=w.getText();
            System.out.println(eachHeadings);

            System.out.println("Su Heading--->");

            List<WebElement> subs= w.findElements(By.xpath("../..//*[@class='menu']/li"));
            for(WebElement sh:subs)
            {
                String subHeads=sh.getText();
                System.out.println(subHeads);
            }


        }


    }
}
