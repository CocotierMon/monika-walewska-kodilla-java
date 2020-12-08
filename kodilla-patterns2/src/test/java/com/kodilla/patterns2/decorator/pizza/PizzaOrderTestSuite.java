package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCosts() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Zamówiona pizza to część podstawowa: ciasto, ser i sos pomidorowy." + '\'' + "Wybrane dodatki:", description);
    }

    @Test
    public void testPizzaOrderWithMushroomsAndExtraCheeseCosts() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal costs = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21), costs);
    }

    @Test
    public void testPizzaOrderWithMushroomsAndExtraCheeseDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Zamówiona pizza to część podstawowa: ciasto, ser i sos pomidorowy.\n"  + "Wybrane dodatki:\n"
                + " + pieczarki\n" + " + extra ser\n"
                , description);
    }

    @Test
    public void HamPepperPepperoniCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new PepperDecorator(pizzaOrder);
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), cost);
    }

    @Test
    public void HamPepperPepperoniDescr() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new PepperDecorator(pizzaOrder);
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        //When
        String descr = pizzaOrder.getDescription();
        System.out.println(descr);
        //Then
        assertEquals("Zamówiona pizza to część podstawowa: ciasto, ser i sos pomidorowy.\n"  + "Wybrane dodatki:\n"
                        + " + szynka\n" + " + papryka\n" + " + pepperoni\n"
                , descr);
    }
}
