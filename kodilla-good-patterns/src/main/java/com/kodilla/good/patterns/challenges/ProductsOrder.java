package com.kodilla.good.patterns.challenges;

public class ProductsOrder implements ProductOrder{

    @Override
    public boolean order(User user, Product product) {
        if(product != null){
        System.out.println("Koszyk użytkownika " + user+ " zawiera: " + product);}
        return true;
    }
}
