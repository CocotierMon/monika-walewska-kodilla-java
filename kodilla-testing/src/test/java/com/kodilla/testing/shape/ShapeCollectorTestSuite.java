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
        testShapeCollector.addFigure(new Circle(4));
        testShapeCollector.addFigure(new Triangle(4, 6));
        testShapeCollector.addFigure(new Triangle(6, 7));
        // Then
        int shapeListSize = testShapeCollector.getShapeListSize();
        testShapeCollector.showFigures();
        Assert.assertEquals(3, shapeListSize);
    }

   @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        //When
       Circle circle = new Circle(5);
       testShapeCollector.addFigure(circle);
       testShapeCollector.addFigure(new Triangle( 3, 4));
       testShapeCollector.addFigure(new Square ( 5));
       testShapeCollector.removeFigure(circle);
        // Then
        int shapeListSize = testShapeCollector.getShapeListSize();
        Assert.assertEquals(2, shapeListSize);
        testShapeCollector.showFigures();
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector testShapeCollector = new ShapeCollector();
        //When
        testShapeCollector.addFigure(new Circle(2));
        testShapeCollector.addFigure(new Triangle(4, 7));
        testShapeCollector.addFigure(new Square(4));
        // Then
        testShapeCollector.showFigures();
        Assert.assertEquals("circle", testShapeCollector.getFigure(0).getShapeName() );    }



    }

