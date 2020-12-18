package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testHomework() {
        //Given
        MentorKodilla mentor1 = new MentorKodilla("Mentor 1");
        MentorKodilla mentor2 = new MentorKodilla("Mentor 2");

        StudentKodilla student1 = new StudentKodilla("Student 1");
        StudentKodilla student2 = new StudentKodilla("Student 2");

        student1.addMentor(mentor1);
        student2.addMentor(mentor2);

        //When
        student1.addHomework("Homework 1");
        student1.addHomework("Homework 2");
        student2.addHomework("Homework 10");

        //Then
        assertEquals(2, mentor1.getHomeworkCounter());
        assertEquals(1, mentor2.getHomeworkCounter());
    }
}
