package com.example;

import org.testng.annotations.Test;

public class TestGroupExample {
    @Test (groups = "smoke")
    public void userCanLogin (){}
    @Test(groups = "smoke")
    public void userVanLogout (){}
    @Test(groups = "smoke")
    public void navBarTest (){}
    @Test (groups = "regretion")
    public void test (){}
}
