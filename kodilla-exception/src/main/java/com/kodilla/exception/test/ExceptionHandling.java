package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
            System.out.println();
        } catch (Exception e){
            System.out.println("Problem ze spełnieniem warunku " + e);
        } finally {
            System.out.println("Warunku nie da się spełnić...");
        }
    }
}
