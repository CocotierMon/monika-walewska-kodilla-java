package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    public OrderGenerator orderGenerator;
    public boolean isOrdered;

    public OrderDto(final OrderGenerator orderGenerator, final boolean isOrdered){
        this.orderGenerator = orderGenerator;
        this.isOrdered = isOrdered;
    }

    public OrderGenerator getOrderGenerator() {
        return orderGenerator;
    }

    public boolean isOrdered(){
        return isOrdered;
    }
}
