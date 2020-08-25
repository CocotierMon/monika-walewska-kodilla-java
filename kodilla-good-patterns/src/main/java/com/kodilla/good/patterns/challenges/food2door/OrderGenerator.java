package com.kodilla.good.patterns.challenges.food2door;

public class OrderGenerator implements ProductOrder{

    private User user;
    private Order order;

    @Override
    public void createOrder() {

        User user = new User("Anna", "Kowalska", "anko.o2.pl");
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        Order order = new Order(user, extraFoodShop.productList.get(1), 1);
        Order order1 = new Order(user, glutenFreeShop.productList.get(1), 3);

        int orderValue = order.getAmount() * order.getProduct().getValue();
        int order1Value = order1.getAmount() * order1.getProduct().getValue();

        System.out.println(order + "Całkowita wartość zamówienia: " +orderValue);
        System.out.println(order1 + "Całkowita wartość zamówienia: "+ order1Value);
    }

    public Order getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }

}
