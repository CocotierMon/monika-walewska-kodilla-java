package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Zamówiona pizza to część podstawowa: ciasto, ser i sos pomidorowy.\n" + "Wybrane dodatki:\n";
    }


}
