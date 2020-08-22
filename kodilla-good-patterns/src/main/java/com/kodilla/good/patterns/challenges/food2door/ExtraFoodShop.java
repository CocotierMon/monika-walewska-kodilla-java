package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producers {

    List<Product> listOfProducts = new ArrayList<>();

    Product product = new Product("Marchew", 3);
    Product product1 = new Product("Ziemniaki", 4);
    Product product2 = new Product("Masło",10);

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;

        listOfProducts.add(product);
        listOfProducts.add(product1);
        listOfProducts.add(product2);
    }

    public List<Product> getListOfProducts(){
        return listOfProducts;
    }

    @Override
    public void process() {
        System.out.println("Dostępne produkty: " + listOfProducts);
    }

    private final String location = "Lodz";
    private final String name = "Extra-food shop";

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }


}
