package com.ucsc.automationcc;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {

    @Test
    @Parameters({"name", "age"})
    public void printMyDetails(@Optional("Kaushalya") String name, @Optional("35") int age){
        System.out.printf("My name is %s and age is %d", name, age);
    }
}
