package com.example;

public class ProductPriceService {

    private Product product;

    public ProductPriceService(Product product) {
        this.product = product;
    }

    public void calculateDiscont (){
        this.product.setDiscont(this.product.getPrice() /2d);
        this.product.setHasDiscont(true);
    }
}