package com.kodilla.spring.intro.shape;

import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawing() {
        //Given
        Drawer drawer = new Drawer(new Circle());
        //When
        drawer.doDrawing();
        //Then
        //do nothing
    }
}
