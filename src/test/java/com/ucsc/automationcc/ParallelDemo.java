package com.ucsc.automationcc;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelDemo {

    long initTime;

    @BeforeTest
    public void beforeTest(){
        initTime = System.currentTimeMillis();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Execution time is : " + (System.currentTimeMillis() - initTime) + "-Ms");
    }

    @Test
    public void method1() throws InterruptedException {
        for(int i = 0; i<5; i++){
            Thread.sleep(3000);
            System.out.println("method1");
        }
    }

    @Test
    public void method2() throws InterruptedException {
        for(int i = 0; i<5; i++){
            Thread.sleep(1000);
            System.out.println("method2");
        }
    }

    @Test
    public void method3() throws InterruptedException {
        for(int i = 0; i<5; i++){
            Thread.sleep(1500);
            System.out.println("method3");
        }
    }

    @Test
    public void method4() throws InterruptedException {
        for(int i = 0; i<5; i++){
            Thread.sleep(2000);
            System.out.println("method4");
        }
    }
}
