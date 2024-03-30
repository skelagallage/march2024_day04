package com.ucsc.automationcc;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemo {

    @Test(enabled = false)
    public void method1(){
        System.out.println("method1-A");
        System.out.println("method1-B");
        System.out.println("method1-C");
    }

    @Test
    public void method2(){
        System.out.println("method2-A");
        if(true)
            throw new SkipException("Reason");
        System.out.println("method2-B");
        System.out.println("method2-C");
    }
}
