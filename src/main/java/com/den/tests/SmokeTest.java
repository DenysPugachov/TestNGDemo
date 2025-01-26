package com.den.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
Smoke testing is a type of software testing that verifies whether the basic functionalities
of an application are working properly. It acts as a preliminary check to determine if the
build is stable enough to proceed with more in-depth testing.

The term originates from hardware testing, where a device was tested by turning it on
and checking if it "smokes" (i.e., fails catastrophically).
In software, smoke tests ensure that the core features of an application do not "break."

Focus Area - Tests only the basic workflows or high-level features, such as login,
navigation, and key functions.
*/

public class SmokeTest {

    @BeforeTest
    public void SmokeTest1() {
        System.out.println("@BeforeTest -> Run SmokeTest.");
    }

}
