package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producers {

    Product product = new Product("Marchew", 3);
    Product product1 = new Product("Ziemniaki", 4);
    Product product2 = new Product("Masło",10);


    @Override
    public void process() {
        System.out.println("Zamówienie : " + product);
    }

    @Override
    public String toString() {
        String location = "Lodz";
        String name = "Extra-food shop";
        return product +
                ", z lokalizacji: " + location +
                ", ze sklepu: " + name;
    }
}
