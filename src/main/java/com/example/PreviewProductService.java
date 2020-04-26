package com.example;

public class PreviewProductService {

    private Product product;

    public PreviewProductService(Product product) {
        this.product = product;
    }

    public String showTitle (){
        if (this.product.isHasDiscont()) {
            return this.product.getTitle() + " (" +this.product.isHasDiscont() + " )";
        }

        return this.product.getTitle();
    }
}
