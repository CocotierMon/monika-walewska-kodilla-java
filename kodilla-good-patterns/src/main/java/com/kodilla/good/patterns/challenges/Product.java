package com.kodilla.good.patterns.challenges;

public class Product {
    private String item;
    private int number;

    public Product(String item, int number) {
        this.item = item;
        this.number = number;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", number=" + number +
                '}';
    }
}
