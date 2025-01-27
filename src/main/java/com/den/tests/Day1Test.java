package com.den.tests;

import org.testng.annotations.*;

public class Day1Test {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("@BeforeClass -> Runs fore class Day1.\n");
    }

    @Test(dependsOnMethods={"thirdTestD1"}) // runs only after certain method
    public void firstTestD1(){
        System.out.println("Run firstTestD1.");
    }

    @Test(enabled=false)
    public void secondTestD1(){
        System.out.println("Run secondTestD1.");
    }

    @Test(timeOut=4000) // set timeOut only for that particular test (if is pulling down all other tests).
    public void thirdTestD1(){
        System.out.println("Run thirdTest Day1.");
    }

    @Test
    public void aForthTestD1(){
        System.out.println("Run aForthTest Day1. Tests in TestNG runs A->Z");
    }

    @Test
    public void AForthTestD1(){
        System.out.println("Run AForthTest Day1. Tests in TestNG runs A->Z case sensitive.");
    }

    @Test
    public void excludeTestD1(){
        System.out.println("Runs excludeTestD1 Day1.");
    }

    @BeforeSuite
    public void beforeSuiteTestD1() {
        System.out.println("@BeforeSuit -> Runs first Day1.");
    }

    @BeforeMethod
    public void beforeEach(){
        System.out.println("@BeforeMethod -> Runs before each methods of Day1.");
    }
    @AfterMethod
    public void afterEach(){
        System.out.println("@AfterMethod -> Runs after each methods of Day1.\n");
    }
}
