package com.weborders.tests;

import com.weborders.pages.Loginpage;
import com.weborders.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends  TestBase{

    @Test(description = "Just login verify title")
    public void loginTest() {
        Loginpage loginpage = new Loginpage();
        loginpage.login();


        String actual = Driver.getDriver().getTitle();
        String expected = "Web Orders";

        Assert.assertEquals(actual,expected,"Page title is wrong!");



    }


}
