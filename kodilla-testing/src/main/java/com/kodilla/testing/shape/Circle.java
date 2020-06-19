package com.kodilla.testing.shape;

public class Circle implements Shape{

    private final String shape;
    private final int r;
    private int field;

    public Circle(int r){
        this.shape = getShapeName();
        this.r = r;
        this.field = getField();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shape='" + shape + '\'' +
                ", field=" + field +
                '}';
    }

    public String getShapeName(){
        return "circle";
    }

    public int getField(){
        return field = (int) (3.14*r*r);
    }
}
