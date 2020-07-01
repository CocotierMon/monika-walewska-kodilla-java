package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Slovakia", new BigDecimal("111111111111")));
        europe.addCountry(new Country("Poland", new BigDecimal("222222222222")));
        europe.addCountry(new Country("Germany", new BigDecimal("333333333333")));
        europe.addCountry(new Country("Spain", new BigDecimal("444444444444")));

        Continent northAmerica = new Continent();
        northAmerica.addCountry(new Country("USA", new BigDecimal("888888888888")));
        northAmerica.addCountry(new Country("Kanada", new BigDecimal("999999999999")));
        northAmerica.addCountry(new Country("Jamajka", new BigDecimal("111111111111")));
        northAmerica.addCountry(new Country("Meksyk", new BigDecimal("222222222222")));

        Continent asia = new Continent();
        asia.addCountry(new Country("Kongo", new BigDecimal("555555555555")));
        asia.addCountry(new Country("Egipt", new BigDecimal("666666666666")));
        asia.addCountry(new Country("Etiopia", new BigDecimal("777777777777")));

        //When
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        BigDecimal actual = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("5333333333328");
        Assert.assertEquals(expectedQuantityPeople, actual );
    }
}
