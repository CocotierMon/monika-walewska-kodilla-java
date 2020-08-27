package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producers {

    private final String location = "Lodz";
    private final String name = "Extra-food shop";

    public ExtraFoodShop() {
        this.initList();
    }

    List<Product> productList = new ArrayList<>();

    public void initList() {
        Product product = new Product("Marchew", 3);
        Product product1 = new Product("Ziemniaki", 4);
        Product product2 = new Product("Masło", 10);
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

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
