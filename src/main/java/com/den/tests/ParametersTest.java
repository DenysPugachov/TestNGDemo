package com.den.tests;

import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class ParametersTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                new String[]{"user1", "pass1", "lsdjkf", "new ", "lksjl"},
                new String[] {"user3", "pass2"},
                new String[]{"user3", "pass3"},
                new String[] {"admin", "mainPassword"},
        };
    }

    @DataProvider(name = "simpleLoginData")
    public Object[][] getSimpleData() {
        return new Object[][]{
                new String[]{"user1", "pass1"},
                new String[] {"user3", "pass2"},
                new String[]{"user3", "pass3"},
                new String[] {"admin", "mainPassword"},
        };
    }


    @Test(dataProvider = "simpleLoginData")
    public void loginSimpleTest(String name, String pass) {
        System.out.println(name + " | "+ pass);
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String [] arrOfArgs) {
        System.out.println(Arrays.toString(arrOfArgs));
    }

    @Test(enabled = false)
    @Parameters({"url"}) // pass params (defined in .xml) in function below
    public void parameterTest1(String url) {
        System.out.println("Test 1: ParameterTest url: " + url);
    }

    @Test(enabled = false)
    @Parameters({"name", "url"})
    public void parameterTest2(String name, String url) {
        System.out.println("Test 2: Parameter name: " + name + url);
    }
}
