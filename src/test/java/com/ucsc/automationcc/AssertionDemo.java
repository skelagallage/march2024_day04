package com.ucsc.automationcc;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

    @Test
    public void hardAssertion(){
//        Assertion assertion = new Assertion();
        System.out.println("HA-01");
        System.out.println("HA-02");
//        assertion.assertTrue(false);
        Assert.assertEquals("Sanath", "Kaushalya");
        System.out.println("HA-03");
        System.out.println("HA-04");
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("SA-01");
        System.out.println("SA-02");
        softAssert.assertTrue(false);
        System.out.println("SA-03");
        System.out.println("SA-04");
        softAssert.assertAll();
    }
}
