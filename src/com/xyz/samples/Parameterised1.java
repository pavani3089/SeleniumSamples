package com.xyz.samples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by pavani on 7/5/17.
 */
public class Parameterised1 {
    @Test (groups = {"Group 1"})
    @Parameters ("myName")
    public void parameterisedTest1(String myName){
        System.out.println("Parameterised name = "+myName);

    }

    @Test (enabled = false, groups = {"Group 1"})
    public void ignore(){
        System.out.println("Ignore Test");
    }

    @Test (groups = {"Group 1","Group 2"})
    public void groupTest1(){
        System.out.println("Group Test 1");
    }
    @Test (groups = {"Group 1"})
    public void groupTest2(){
        System.out.println("Group Test 2");
    }
    @Test (groups = {"Group 2"})
    public void groupTest3(){
        System.out.println("Group Test 3");
    }
}
