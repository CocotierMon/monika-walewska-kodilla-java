package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producers {

    List<Product> listOfProducts = new ArrayList<>();

    Product product = new Product("Koperek", 2);
    Product product1 = new Product("Ryż", 5);
    Product product2 = new Product("Fasolka", 4);

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;

        listOfProducts.add(product);
        listOfProducts.add(product1);
        listOfProducts.add(product2);
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public void process() {
        System.out.println("Dostępne produkty: " + listOfProducts);
    }

    private final String location = "Zgierz";

    public String getLocation() {
        return location;
    }
}
