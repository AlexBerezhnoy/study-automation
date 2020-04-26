package com.example;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FixtureDiscriptionTest {
    @BeforeSuite
    public void beforeSuite (){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite (){
        System.out.println("afterSuite");
    }
    @BeforeTest
    public void beforeTest (){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest (){
        System.out.println("afterTest");
    }
    @BeforeClass
    public void beforeClass (){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("afterClass");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
    @Test
    public void discountShouldBeCalculatedTest(){
        Product book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("Withser");

        System.out.println(book);

        ProductPriceService priceService = new ProductPriceService(book);
        priceService.calculateDiscont();

        System.out.println(book);

//        if (book.getDiscont() !=25.5) {
//            throw new AssertionError("Wrong discount calculation!");
//        }

        assertEquals(book.getDiscont(), 27.5, "Wrong discount calculation!");

    }

    @Test
    public void hasDiscountShouldBeTest(){
        Product book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("The Witcher");

        System.out.println(book);

        ProductPriceService priceService = new ProductPriceService(book);
        priceService.calculateDiscont();

        System.out.println(book);

        assertTrue(book.isHasDiscont(), "Product should have discount!");
//        assertFalse(book.isHasDiscont(),"Product should not have discount!");
    }
}
