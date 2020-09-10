package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Cebula")
                .bun("Bez sezamu")
                .burgers(1)
                .ingredient("Pomidor")
                .sauce("1000 wysp")
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(1, howManyBurgers);
    }
}
