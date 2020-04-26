package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PreviewPriceServiceTest {
    private Product book;
    private PreviewProductService previewProductService;
    private double discount = 27.5;

    @BeforeMethod
    public void beforeMethod() {
//       setup data
        book = new Product();
        book.setId(1L);
        book.setPrice(55D);
        book.setTitle("Witcher");
        previewProductService = new PreviewProductService(book);
    }

    @AfterMethod
    public void afterMethod() {
//        clean data
        book = null;
        previewProductService = null;
    }
    @Test
    public void showTitleWithoutDiscount (){
        assertEquals(previewProductService.showTitle(), book.getTitle());
    }

    @Test
    public void showTitleWithDiscount (){
//        book.setHasDiscont(true);
        book.setDiscont(discount);
        assertEquals(previewProductService.showTitle(), book.getTitle() + " (" +discount + ")");
    }
}
