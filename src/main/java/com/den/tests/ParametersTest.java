package com.den.tests;

import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class ParametersTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{new String[]{"user1", "pass1", "lsdjkf", "new ", "lksjl"}, new String[]{"user3", "pass2"}, new String[]{"user3", "pass3"}, new String[]{"admin", "mainPassword"},};
    }

    @DataProvider(name = "rachul")
    public Object[][] getRachulMethod() {
        // [3][4] -> 3 sets with [4] values (variants)
        Object[][] data = new Object[3][4];

        // [1] first set of data
        data[0][0] = " 0 0 ";
        data[0][1] = " 0 1 ";
        data[0][2] = " 0 2 ";
        data[0][3] = " 0 3 ";

        // [2] second set of data
        data[1][0] = " 1 0 ";
        data[1][1] = " 1 1 ";
        data[1][2] = " 1 2 ";

        // [3] third set of data
        data[2][0] = " 2 0 ";
        data[2][1] = " 2 1 ";
        
        return data;
    }

    @Test(dataProvider = "rachul")
    public void rachulDataProviderTest(String s, String s2, String s3, String s4) {
        System.out.println("rachulDataProviderTest: " + s + " " + s2 + " " + s3 + " " + s4);
    }

    // test multiple argument
    @Test(dataProvider = "rachul")
    public void rachulDataLoopArgumentsTest(String... args){
        String acc = "";
        for(String arg: args){
            acc += arg +", ";

        }
            System.out.println("rachulDataLoopArgumentsTest: " + acc);
    }

    @DataProvider(name = "simpleLoginData")
    public Object[][] getSimpleData() {
        return new Object[][]{new String[]{"user1", "pass1"}, new String[]{"user3", "pass2"}, new String[]{"user3", "pass3"}, new String[]{"admin", "mainPassword"},};
    }


    @Test(dataProvider = "simpleLoginData")
    public void loginSimpleTest(String name, String pass) {
        System.out.println(name + " | " + pass);
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String[] arrOfArgs) {
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
