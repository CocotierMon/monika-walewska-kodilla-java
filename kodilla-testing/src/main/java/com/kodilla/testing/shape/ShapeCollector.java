package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private final List<Shape> shapeList;


         public ShapeCollector() {
             this.shapeList = new ArrayList<>();
          }


    public void addFigure(Shape shape){
            shapeList.add(shape);
        }

        public void removeFigure(Shape shape){
            shapeList.remove(shape);
        }

        public Shape getFigure(int n){
            return shapeList.get(n);
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

