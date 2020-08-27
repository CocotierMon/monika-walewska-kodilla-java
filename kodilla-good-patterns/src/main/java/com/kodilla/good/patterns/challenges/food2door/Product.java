package com.kodilla.good.patterns.challenges.food2door;

public class Product implements Producers {

    private final String product;
    private final int value;

    public Product(String product, int value) {
        this.product = product;
        this.value = value;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return '\n' + product + ", o wartości: " + value;
    }

    @Override
    public void process() {
    }

    @Override
    public int getValue() {
        return value;
    }
}
