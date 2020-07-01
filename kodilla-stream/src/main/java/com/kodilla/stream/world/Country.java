package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public final BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}