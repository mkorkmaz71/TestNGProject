package com.automation.testcases;


import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @Test(groups = {"Smoke Test","Chirag Test"})
    public void verifyUserCanLogin() {
        System.out.println("verify login successful");
    }

    @Test(groups = "Chirag Test")
    public void verifyUserCanNotLoginWithInvalidCredentials() {
        System.out.println("verify login unsuccessful for invalid credentials");
    }

    @Test(groups = "Smoke Test")
    public void verifyUserCanResetPassword() {
        System.out.println("verify user can reset password");
    }
}
