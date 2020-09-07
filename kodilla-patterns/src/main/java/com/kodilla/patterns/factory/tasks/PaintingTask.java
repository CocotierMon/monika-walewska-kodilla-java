package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToPaint;
    final boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean isTaskExecuted){
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isTaskExecuted = isTaskExecuted;
    }
    @Override
    public String executeTask() {
        return String.valueOf(isTaskExecuted);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                ", isTaskExecuted=" + isTaskExecuted +
                '}';
    }
}
