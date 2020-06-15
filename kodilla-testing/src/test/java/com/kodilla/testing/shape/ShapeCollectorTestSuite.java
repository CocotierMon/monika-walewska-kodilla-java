package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        //When
        testShapeCollector.addFigure(new Circle("circle", 54));
        testShapeCollector.addFigure(new Triangle("triangle", 54));
        // Then
        int shapeListSize = testShapeCollector.getShapeListSize();
        Assert.assertEquals(2, shapeListSize);
    }

   @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        //When
       testShapeCollector.addFigure(new Circle("circle", 54));
       testShapeCollector.addFigure(new Triangle("triangle", 54));
       testShapeCollector.addFigure(new Square ("square",8));
       testShapeCollector.removeFigure(new Circle("circle", 54));
        // Then
        int shapeListSize = testShapeCollector.getShapeListSize();
        Assert.assertEquals(2, shapeListSize);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        //When
        testShapeCollector.addFigure(new Circle("circle", 4));
        testShapeCollector.addFigure(new Triangle("triangle", 8));
        testShapeCollector.addFigure(new Square("square", 9));
        // Then
        System.out.println(testShapeCollector.getFigure(2));
    }

   /* @Test
    public void testShowFigures(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        //When
        testShapeCollector.addFigure(new Circle("circle", 4));
        testShapeCollector.addFigure(new Triangle("triangle", 8));
        testShapeCollector.addFigure(new Square("square", 9));
        // Then
        System.out.println(testShapeCollector.showFigures());
    }*/

    }

