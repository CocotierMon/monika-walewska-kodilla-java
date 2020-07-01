package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    public Continent() {
    }

    public List<Country> getCountries() {
        return countries;
    }

    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
    countries.add(country);
    }
}
