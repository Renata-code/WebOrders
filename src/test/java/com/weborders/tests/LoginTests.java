package com.weborders.tests;

import com.weborders.pages.Loginpage;
import com.weborders.utilities.BrowserUtils;
import com.weborders.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;



    public class LoginTests extends TestBase {
        Loginpage loginPage = new Loginpage();

        @Test(description = "Just login and verify title")
        public void loginTest() {
            Loginpage loginPage = new Loginpage();
            loginPage.login();
            //assertion
            String actual = Driver.getDriver().getTitle();
            String expected = "Web Orders";
            Assert.assertEquals(actual, expected, "Page title is wrong!");
            BrowserUtils.takeScreenshot();
        }

    }

