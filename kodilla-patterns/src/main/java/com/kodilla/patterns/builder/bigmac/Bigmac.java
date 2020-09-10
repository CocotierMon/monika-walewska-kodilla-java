package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private String bun;
    private int burgers;
    private List<String> sauces;
    private List<String> ingredients;

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }


       public BigmacBuilder sauce(String sauce) {
            sauces.add(sauce);
           return this;
       }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauces, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, List<String> sauces, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauce() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bułka='" + bun + '\'' +
                ", ilość kotletów='" + burgers + '\'' +
                ", sos='" + sauces + '\'' +
                ", składniki=" + ingredients +
                '}';
    }

}
