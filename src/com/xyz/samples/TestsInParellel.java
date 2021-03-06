package com.xyz.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by pavani on 7/5/17.
 */
public class TestsInParellel {

    @Test
    public void tc1() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement w1 = driver.findElement(By.name("firstname"));
        w1.sendKeys("xyz");
        WebElement w2 = driver.findElement(By.name("lastname"));
        w2.sendKeys("abc");
        WebElement w3 = driver.findElement(By.name("reg_email__"));
        w3.sendKeys("xyz.abc@gmail.com");
        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("xyz.abc@gmail.com");
        WebElement w4 = driver.findElement(By.name("reg_passwd__"));
        w4.sendKeys("*****");
        WebElement w5 = driver.findElement(By.name("birthday_month"));
        Select month = new Select(w5);
        month.selectByVisibleText("May");
        WebElement w6 = driver.findElement(By.name("birthday_day"));
        Select day = new Select(w6);
        day.selectByValue("15");
        WebElement w7 = driver.findElement(By.name("birthday_year"));
        Select year = new Select(w7);
        year.selectByVisibleText("1995");
        WebElement w8 = driver.findElement(By.name("sex"));
        w8.click();
        WebElement w9 = driver.findElement(By.name("websubmit"));
        w9.click();
        Thread.sleep(5000);

        driver.quit();
    }

    @Test
    public void tc2() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement w1 = driver.findElement(By.name("firstname"));
        w1.sendKeys("xyz");
        WebElement w2 = driver.findElement(By.name("lastname"));
        w2.sendKeys("abc");
        WebElement w3 = driver.findElement(By.name("reg_email__"));
        w3.sendKeys("xyz.abc@gmail.com");
        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("xyz.abc@gmail.com");
        WebElement w4 = driver.findElement(By.name("reg_passwd__"));
        w4.sendKeys("*****");
        WebElement w5 = driver.findElement(By.name("birthday_month"));
        Select month = new Select(w5);
        month.selectByVisibleText("May");
        WebElement w6 = driver.findElement(By.name("birthday_day"));
        Select day = new Select(w6);
        day.selectByValue("15");
        WebElement w7 = driver.findElement(By.name("birthday_year"));
        Select year = new Select(w7);
        year.selectByVisibleText("1995");
        WebElement w8 = driver.findElement(By.name("sex"));
        w8.click();
        WebElement w9 = driver.findElement(By.name("websubmit"));
        w9.click();
        Thread.sleep(5000);

        driver.quit();
    }


    @Test
    public void tc3() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement w1 = driver.findElement(By.name("firstname"));
        w1.sendKeys("xyz");
        WebElement w2 = driver.findElement(By.name("lastname"));
        w2.sendKeys("abc");
        WebElement w3 = driver.findElement(By.name("reg_email__"));
        w3.sendKeys("xyz.abc@gmail.com");
        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("xyz.abc@gmail.com");
        WebElement w4 = driver.findElement(By.name("reg_passwd__"));
        w4.sendKeys("*****");
        WebElement w5 = driver.findElement(By.name("birthday_month"));
        Select month = new Select(w5);
        month.selectByVisibleText("May");
        WebElement w6 = driver.findElement(By.name("birthday_day"));
        Select day = new Select(w6);
        day.selectByValue("15");
        WebElement w7 = driver.findElement(By.name("birthday_year"));
        Select year = new Select(w7);
        year.selectByVisibleText("1995");
        WebElement w8 = driver.findElement(By.name("sex"));
        w8.click();
        WebElement w9 = driver.findElement(By.name("websubmit"));
        w9.click();
        Thread.sleep(5000);

        driver.quit();
    }


    @Test
    public void tc4() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement w1 = driver.findElement(By.name("firstname"));
        w1.sendKeys("xyz");
        WebElement w2 = driver.findElement(By.name("lastname"));
        w2.sendKeys("abc");
        WebElement w3 = driver.findElement(By.name("reg_email__"));
        w3.sendKeys("xyz.abc@gmail.com");
        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("xyz.abc@gmail.com");
        WebElement w4 = driver.findElement(By.name("reg_passwd__"));
        w4.sendKeys("*****");
        WebElement w5 = driver.findElement(By.name("birthday_month"));
        Select month = new Select(w5);
        month.selectByVisibleText("May");
        WebElement w6 = driver.findElement(By.name("birthday_day"));
        Select day = new Select(w6);
        day.selectByValue("15");
        WebElement w7 = driver.findElement(By.name("birthday_year"));
        Select year = new Select(w7);
        year.selectByVisibleText("1995");
        WebElement w8 = driver.findElement(By.name("sex"));
        w8.click();
        WebElement w9 = driver.findElement(By.name("websubmit"));
        w9.click();
        Thread.sleep(5000);

        driver.quit();
    }

}
