package com.kodilla.good.patterns.challenges.food2door;

public class OrderGenerator implements ProductOrder{

    private User user;
    private Order order;

    public OrderGenerator() {
    }

    public void createOrder() {

        User user = new User("Anna", "Kowalska", "anko.o2.pl");
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        Order order = new Order(user, extraFoodShop.product2, 1);

        System.out.println(order);
    }

    public Order getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean order(User user, Order order) {
        if(order != null);
        return true;
    }
}
