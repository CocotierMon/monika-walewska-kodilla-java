package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public Shape shape;
    public List<Shape> shapeList;


         public ShapeCollector() {
             this.shapeList = new ArrayList<>();
          }


    public void addFigure(Shape shape){
            shapeList.add(this.shape);
        }

        public void removeFigure(Shape shape){
            shapeList.remove(this.shape);
        }

        public ShapeCollector getFigure(int n){
            return (ShapeCollector) shapeList.get(n);
        }

        public void showFigures(){
            for (Shape element : shapeList) {
                System.out.println("Element: " + element);
            }
        }

        public int getShapeListSize(){
            return shapeList.size();
        }
    }

