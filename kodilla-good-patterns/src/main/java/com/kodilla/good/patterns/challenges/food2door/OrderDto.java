package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    public Order order;
    public boolean isOrdered;

    public OrderDto(final Order order, final boolean isOrdered){
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrdered(){
        return isOrdered;
    }
}
