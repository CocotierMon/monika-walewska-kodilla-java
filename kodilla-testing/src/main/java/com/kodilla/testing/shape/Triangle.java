package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private final String shape;
    private final int a;
    private final int h;
    private int field;

    public Triangle(String shape, int a, int h){
        this.shape = shape;
        this.a = a;
        this.h = h;
        setField();
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

    private void setField() {
        this.field = (int) (0.5*a*h);
    }
    public int getField(){
        return field;
    }
}
