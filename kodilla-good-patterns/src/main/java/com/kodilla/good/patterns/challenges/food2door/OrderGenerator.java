package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderGenerator {

    public OrderGenerator() {
    }

    User user;
    List<Order> orderList;

    public OrderDto createOrder() {

        User user = new User("Anna", "Kowalska", "anko.o2.pl");
        Producers product = new ExtraFoodShop().getListOfProducts().get(1);
        Producers product1 = new GlutenFreeShop().getListOfProducts().get(1);

        Order order = new Order(user, product, 2);
        Order order1 = new Order(user, product1,1);

        orderList.add(order);
        orderList.add(order1);

        System.out.println("Przygotowano zamówienie " + orderList);
        return (OrderDto) orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public User getUser() {
        return user;
    }
}
