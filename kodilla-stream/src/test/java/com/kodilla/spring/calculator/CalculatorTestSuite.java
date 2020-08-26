package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static jdk.nashorn.internal.objects.Global.Infinity;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        // Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double add = calculator.add(5, 5);
        double sub = calculator.sub(5,5);
        double mul = calculator.mul(5,5);
        //Then
        Assert.assertEquals(10, add, 0.1);
        Assert.assertEquals(0, sub, 0.1);
        Assert.assertEquals(25, mul, 0.1);
    }

    @Test
    public void divTest(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e){
            System.out.println('\n' + " " + "!!! Błąd dzielenia przez 0 !!!" + '\n' + e);
        }
        //Then
        Assert.assertEquals(Infinity, calculator.div(5, 0), 0.1);
    }
}
