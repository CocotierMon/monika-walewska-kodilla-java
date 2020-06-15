package com.kodilla.testing.shape;

public class Square implements Shape{

    private final String shape;
    private final int a = 4;
    private final int field = a * a;

    public Square(String shape){
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Square{" +
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
