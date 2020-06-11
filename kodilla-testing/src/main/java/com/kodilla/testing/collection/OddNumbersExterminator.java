package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer>exterminate(ArrayList<Integer>numbers){
        ArrayList <Integer> evenNumbersList = new ArrayList<>();

        for(Integer evenNumbers: numbers)
            if (evenNumbers % 2 == 0) {
                evenNumbersList.add(evenNumbers);
            }
        return evenNumbersList;
    }
}
