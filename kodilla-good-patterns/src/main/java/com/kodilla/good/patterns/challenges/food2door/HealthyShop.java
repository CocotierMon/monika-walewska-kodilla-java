package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Producers{

    Product product = new Product("Pietruszka", 3);
    Product product1 = new Product("Ser", 5);
    Product product2 = new Product("Szynka",10);

    @Override
    public void process() {
        System.out.println("Dostępne produkty: " + product);
    }

    @Override
    public String toString() {
        String name = "Extra-food shop";
        String location = "Pabianice";
        return product +
                ", ze sklepu: " + name +
                ", z lokalizacji: " + location;
    }
}
