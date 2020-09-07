package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping on monday", "dress", 1, true);
            case PAINTING:
                return new PaintingTask("Painting on tuesday", "blue", "kids room", false);
            case DRIVING:
                return new DrivingTask("Driving to the conference", "Warsaw", "car", false);
            default:
                return null;
        }
    }
}