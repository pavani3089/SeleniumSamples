package com.xyz.samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pavani on 7/4/17.
 */
public class GroupTestEx {

    @Test(groups = { "functest", "checkintest" })
    public void tc1()
    {
        PavaniUtil p=new PavaniUtil("def");


        String expected="abc";

        Assert.assertEquals(p.getMessage(),expected);
    }

    @Test(groups = {  "checkintest" })
    public void tc2()

    {
        String actual="abc1";
        String expected="abc";

        Assert.assertEquals(actual,expected);
    }


    @Test
    public void tc3()
    {
        String actual="abc";
        String expected="abc";

        Assert.assertEquals(actual,expected);
    }
}
