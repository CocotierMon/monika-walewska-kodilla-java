package com.kodilla.testing.shape;

public class Circle implements Shape{

    private final String shape;
    private final int r;
    private int field;

    public Circle(String shape, int r){
        this.shape = shape;
        this.r = r;
        setField();
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

    public void setField(){
        this.field = (int) (3.14*r*r);
    }
    public int getField(){
        return field;
    }
}
