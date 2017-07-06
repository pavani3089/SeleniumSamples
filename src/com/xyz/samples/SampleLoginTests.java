package com.xyz.samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pavani on 7/3/17.
 */
public class SampleLoginTests {

    @Test
    public void tc1()
    {
        System.out.println("TC1");
    }

    @Test
    public void tc2()
    {
        System.out.println("TC1");
    }

    @Test
    public void tc3()
    {
        System.out.println("TC1");

        Assert.assertEquals(1,2,"Failed man");
    }
    @Test
    public void tc4()
    {
        System.out.println("TC1");
    }


}
