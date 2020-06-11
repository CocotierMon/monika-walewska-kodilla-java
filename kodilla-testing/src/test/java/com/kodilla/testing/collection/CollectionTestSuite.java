package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){ System.out.println("Test Case: begin"); }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> newList = new ArrayList<>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(newList);
        //Then
        Assert.assertEquals(0, result.size());
        System.out.println("Lista jest pusta");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumberExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);

        ArrayList<Integer> result = oddNumberExterminator.exterminate(newList);
        oddNumberExterminator.exterminate(newList);
        System.out.println("Dodane liczby to: " + result);
        //Then
        for(Integer newListNumbers: result)
            if (newListNumbers % 2 == 0) {
            } else {
                System.out.println("Błąd");
            }
        System.out.println("W liście znajdują się liczby parzyste" + result);
            }
        }




