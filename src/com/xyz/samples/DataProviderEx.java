package com.xyz.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by pavani on 7/5/17.
 */
public class DataProviderEx {

    WebDriver driver=null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/pavani/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");

    }



    @DataProvider(name = "test1")
    public static Object[][] logins() {
        return new Object[][] {{"Pavani", "Pavani123","xyzz"},{"yuva","pwd","sss"}};
    }



    @Test(dataProvider="test1")
    public void fbLogin(String uname,String pwd,String expectedValue)

    {
        System.out.println(uname+"-->"+pwd+"-->"+expectedValue);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
