package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shape;
    private final int a = 6;
    private final int h = 10;
    private final int field = (int) (0.5 * a * h);

    public Triangle(String shape){
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Triangle{" +
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
