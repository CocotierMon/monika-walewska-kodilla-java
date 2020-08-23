package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService {

    public ProductOrderService(final ProductOrder productOrder) {
    }

    public OrderDto process(final ProductOrder productOrder){

        OrderGenerator orderGenerator = new OrderGenerator();

        boolean isOrdered = productOrder.order(orderGenerator.getUser(), orderGenerator.getOrder());
        if(isOrdered){
            return new OrderDto(orderGenerator.getOrder(), true);
        } else {
            return new OrderDto(orderGenerator.getOrder(), false);
        }
    }

    public static void main(String[] args) {

        OrderGenerator orderGenerator = new OrderGenerator();
        orderGenerator.createOrder();
        ProductOrderService productOrderService = new ProductOrderService(orderGenerator);
        productOrderService.process(orderGenerator);

    }
}
