package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.executeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping on monday", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
        System.out.println(shopping);
    }

    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.executeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting on tuesday", painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
        System.out.println(painting);
    }

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.executeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving to the conference", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
        System.out.println(driving);
    }
}
