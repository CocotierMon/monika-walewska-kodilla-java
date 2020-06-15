package com.kodilla.testing.shape;

public class Circle implements Shape{

    private final String shape;
    private final int r = 5;
    private final int field = (int) (3.14 * r * r);

    public Circle(String shape){
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shape='" + shape + '\'' +
                ", field=" + field +
                '}';
    }

    public String getShapeName(){
        return this.shape;
    }

    public int getField(){
        return field;
    }
}
