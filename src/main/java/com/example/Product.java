package com.example;

public class Product {
    private long id;
    private double price;
    private String title;
    private double discont;
    private boolean hasDiscont;

    public boolean isHasDiscont() {
        return hasDiscont;
    }

    public void setHasDiscont(boolean hasDiscont) {
        this.hasDiscont = hasDiscont;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDiscont() {
        return discont;
    }

    public void setDiscont(double discont) {
        this.discont = discont;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", discont=" + discont +
                ", hasDiscont=" + hasDiscont +
                '}';
    }
}
