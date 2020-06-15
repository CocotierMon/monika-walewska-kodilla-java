package com.kodilla.testing.shape;

public class Square implements Shape{

    public String shape;
    public int field;

    public Square(String shape, int field){
        this.shape = shape;
        this.field = field;
    }

    public String getShapeName(){
        return this.shape;
    }

    public int getField(){
        return this.field;
    }
}
