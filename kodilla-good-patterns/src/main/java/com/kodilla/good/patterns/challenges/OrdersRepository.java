package com.kodilla.good.patterns.challenges;

public class OrdersRepository implements OrderRepository{

    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Stworzono nowe zamówienie: " + product);
    }
}
