package com.kodilla.good.patterns.challenges.food2door;


public class ProductOrderService {

    public OrderDto process(){
        boolean isOrdered = true;

        if(isOrdered){
            return new OrderGenerator().createOrder();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process();

    }
}
