package com.example;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ProductPriceServiceTest {
    private Product book;
    private ProductPriceService priceService;

    @BeforeMethod
    public void beforeMethod() {
//       setup data
        book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("Witcher");
        priceService = new ProductPriceService(book);
    }

    @AfterMethod
    public void afterMethod() {
//        clean data
        book = null;
        priceService = null;
    }

    @Test
    public void discountShouldBeCalculatedTest(){
        priceService.calculateDiscont();

        System.out.println(book);
//        if (book.getDiscont() !=25.5) {
//            throw new AssertionError("Wrong discount calculation!");
//        }
        assertEquals(book.getDiscont(), 27.5, "Wrong discount calculation!");

    }

    @Test
    public void hasDiscountShouldBeTest(){
        priceService.calculateDiscont();

        System.out.println(book);

        assertTrue(book.isHasDiscont(), "Product should have discount!");
//        assertFalse(book.isHasDiscont(),"Product should not have discount!");
    }
}
