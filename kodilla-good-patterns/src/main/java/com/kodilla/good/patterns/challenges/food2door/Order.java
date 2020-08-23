package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private User user;
    private Producers product;
    private int ammount;

    public Order(User user, Producers product, int ammount) {
        this.user = user;
        this.product = product;
        this.ammount = ammount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Producers getProduct() {
        return product;
    }

    public void setProduct(Producers product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Zamówienie: " +
                "użytkownik: " + user +
                ", produkt: " + product +
                ", liczba produktów: " + ammount;
    }
}

