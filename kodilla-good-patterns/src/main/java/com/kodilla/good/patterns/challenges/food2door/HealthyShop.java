package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producers{

    public HealthyShop() {
        this.initList();
    }

    List<Product> productList = new ArrayList<>();

    public void initList() {
        Product product = new Product("Pietruszka", 3);
        Product product1 = new Product("Ser", 5);
        Product product2 = new Product("Szynka",10);

        productList.add(product);
        productList.add(product1);
        productList.add(product2);

    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void process() {
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public String toString() {
        String name = "Extra-food shop";
        String location = "Pabianice";
        return productList +
                ", ze sklepu: " + name +
                ", z lokalizacji: " + location;
    }
}
