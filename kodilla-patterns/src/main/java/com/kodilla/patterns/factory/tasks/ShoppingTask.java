package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    final String taskName;
    final String whatToBuy;
    final double quantity;
    final boolean isTaskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean isTaskExecuted){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", isTaskExecuted=" + isTaskExecuted +
                '}';
    }
}
