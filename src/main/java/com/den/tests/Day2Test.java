package com.den.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2Test {

    @AfterTest
    public void finishTest(){
        System.out.println("@After Test -> Runs in the end of test.");
    }

    @Test
    public void firstTestD2(){
        System.out.println("Run firstTestD2");
    }

    @AfterSuite
    public void afterSuiteTest(){
        System.out.println("@AfterSuit -> Runs After Suite Test Day 2. ");
    }

    @Test
    public void secondTestD2(){
        System.out.println("Run secondTestD2");
    }

}
