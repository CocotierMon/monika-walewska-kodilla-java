package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private User user;
    private Producers product;
    private final int amount;

    public Order(User user, Producers product, int amount) {
        this.user = user;
        this.product = product;
        this.amount = amount;
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

    public int getAmount() { return amount; }

    @Override
    public String toString() {
        return "Zamówienie: " +
                "użytkownik: " + user +
                ", produkt: " + product +
                ", liczba produktów: " + amount + '\n';
    }
}

