package com.example;

import org.testng.annotations.Test;

public class TestAnnotationExample {

    @Test(enabled = false)
    public void disableTest(){
        System.out.println("disableTest");
    }
    @Test(description = "My cool test")
    public void testWithDescription(){
        System.out.println("testWithDescription");
    }

    @Test (priority = 2)
    public void priorityTest1 (){
        System.out.println("priorityTest 1");
    }

    @Test (priority = 1)
    public void priorityTest2(){
        System.out.println("priorityTest 2");
    }

    @Test ()
    public void dependsParentTest(){
        System.out.println("priorityTest 2");
    }


    @Test (dependsOnMethods = "dependsParentTest")
    public void dependsChildTest(){
        System.out.println("priorityTest 2");
    }

    @Test (expectedExceptions = {ArithmeticException.class}, expectedExceptionsMessageRegExp = "/ by zero")
    public void exceptionTest() {
        int result = 5/0;
    }
}
