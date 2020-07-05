package com.kodilla.exception.test;

public class RouteNotFoundException extends Throwable {
    public RouteNotFoundException(String s) {
        System.out.println(s);
    }
}
