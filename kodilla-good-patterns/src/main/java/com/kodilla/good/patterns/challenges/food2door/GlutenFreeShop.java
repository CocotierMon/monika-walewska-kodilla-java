package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producers {

    private final String name = "Gluten Free Shop";
    private final String location = "Zgierz";

    public GlutenFreeShop() {
        this.initList();
    }

    List<Product> productList = new ArrayList<>();

    public void initList() {
        Product product = new Product("Koperek", 2);
        Product product1 = new Product("Ryż", 5);
        Product product2 = new Product("Fasolka", 4);

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

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
