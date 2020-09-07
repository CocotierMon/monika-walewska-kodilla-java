package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    final String taskName;
    final String where;
    final String using;
    final boolean isTaskExecuted;

    public DrivingTask(String taskName, String where, String using, boolean isTaskExecuted){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                ", isTaskExecuted=" + isTaskExecuted +
                '}';
    }
}
