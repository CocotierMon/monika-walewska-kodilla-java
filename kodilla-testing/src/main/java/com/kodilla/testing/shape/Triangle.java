package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private final String shape;
    private final int a;
    private final int h;
    private int field;

    public Triangle(int a, int h){
        this.shape = getShapeName();
        this.a = a;
        this.h = h;
        this.field = getField();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shape='" + shape + '\'' +
                ", field=" + field +
                '}';
    }

    public String getShapeName(){
        return "triangle";
    }

    public int getField(){
        return field = (int) (0.5*a*h);
    }
}
