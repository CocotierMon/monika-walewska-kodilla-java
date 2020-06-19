package com.kodilla.testing.shape;

public class Square implements Shape{

    private final String shape;
    private final int a;
    private int field;

    public Square(int a){
        this.shape = getShapeName();
        this.a = a;
        this.field = getField();
    }

    @Override
    public String toString() {
        return "Square{" +
                "shape='" + shape + '\'' +
                ", field=" + field +
                '}';
    }

    public String getShapeName(){
        return "square";
    }

    public int getField(){
        return field = a * a;
    }
}
