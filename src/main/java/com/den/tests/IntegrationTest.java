package com.den.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IntegrationTest {

    @Parameters({"key_integration"})
    @Test
    public void integrationTest(String key3){
        System.out.println("Run Integration test. with params key_integration: " + key3);
    }
}
