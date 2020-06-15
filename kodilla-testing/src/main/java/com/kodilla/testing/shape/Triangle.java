package com.kodilla.testing.shape;

public class Triangle implements Shape{

    public String shape;
    public int field;

    public Triangle(String shape, int field){
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
