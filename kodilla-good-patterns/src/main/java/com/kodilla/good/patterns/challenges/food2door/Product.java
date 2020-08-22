package com.kodilla.good.patterns.challenges.food2door;

public class Product implements Producers {

    String product;
    int value;

    public Product(String product, int value) {
        this.product = product;
        this.value = value;
    }

    public String getProduct() {
        return product;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void process() {

    }
}
