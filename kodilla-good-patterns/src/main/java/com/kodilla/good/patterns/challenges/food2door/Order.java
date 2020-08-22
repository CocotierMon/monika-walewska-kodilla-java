package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

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

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public static List<Order> generateOrderList(){

        List<Order>orderList = new ArrayList<>();
        return orderList;
    }

}

