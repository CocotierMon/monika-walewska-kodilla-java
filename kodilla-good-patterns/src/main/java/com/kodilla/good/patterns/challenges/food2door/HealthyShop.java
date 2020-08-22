package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producers{

    List<Product> listOfProducts = new ArrayList<>();

    Product product = new Product("Pietruszka", 3);
    Product product1 = new Product("Ser", 5);
    Product product2 = new Product("Szynka",10);

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


    private final String location = "Pabianice";

    public String getLocation() {
        return location;
    }

}
