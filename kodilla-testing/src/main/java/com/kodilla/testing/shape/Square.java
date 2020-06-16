package com.kodilla.testing.shape;

public class Square implements Shape{

    private final String shape;
    private final int a;
    private int field;

    public Square(String shape, int a){
        this.shape = shape;
        this.a = a;
        setField();
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
    public void setField(){
        field = a * a;
    }
    public int getField(){
        return field;
    }
}
