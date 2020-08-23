package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Producers {

    Product product = new Product("Koperek", 2);
    Product product1 = new Product("Ryż", 5);
    Product product2 = new Product("Fasolka", 4);

    @Override
    public void process() {
        System.out.println("Dostępne produkty: " + product);
    }

    @Override
    public String toString() {
        String name = "Extra-food shop";
        String location = "Zgierz";
        return  product +
                ", ze sklepu: " + name +
                ", z lokalizacji: " + location;
    }
}
