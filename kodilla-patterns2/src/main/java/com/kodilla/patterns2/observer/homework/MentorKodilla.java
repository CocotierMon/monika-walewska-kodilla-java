package com.kodilla.patterns2.observer.homework;

public class MentorKodilla implements MentorInterface{
    private final String mentorsName;
    private int homeworkCounter;

    public MentorKodilla(String mentorsName) {
        this.mentorsName = mentorsName;
    }

    @Override
    public void upgrade(String homework, String studentsName) {
        System.out.println("Nowe zadanie do sprawdzenia: " + homework + " od kursanta: " + studentsName);
        homeworkCounter++;
    }

    public String getMentorsName() {
        return mentorsName;
    }

    public int getHomeworkCounter() {
        return homeworkCounter;
    }
}
