package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {
    @Test
    public void testSoftAssert(){
        SoftAssert softAssert= new SoftAssert();

        softAssert.assertEquals(2,2);
        softAssert.assertEquals("Chirag","Chirga");
        softAssert.assertEquals(10,10);
        softAssert.assertEquals("Test","Tet");
        softAssert.assertEquals("DevX","DeX");
        softAssert.assertEquals(true,true);
        softAssert.assertAll();
        System.out.println("Soft Assert Test Ends");
}
    @Test
    public void testHardAssert(){
        Assert.assertEquals(2,2);
        Assert.assertEquals("Chirag","Chirga");
        Assert.assertEquals(10,10);
        Assert.assertEquals("Test","Test");
        Assert.assertEquals("DevX","DevX");
        Assert.assertEquals(true,true);
        System.out.println("Hard Assert Test Ends");
    }
}
