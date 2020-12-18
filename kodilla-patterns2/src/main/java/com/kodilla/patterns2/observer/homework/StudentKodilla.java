package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentKodilla implements StudentInterface {
    private final String studentsName;
    private final Deque<String> queue;
    private final List<MentorKodilla> mentorList;

    public StudentKodilla(String studentsName) {
        this.studentsName = studentsName;
        this.queue = new ArrayDeque<>();
        this.mentorList = new ArrayList<>();
    }

    public void addHomework(String homework) {
        queue.offerLast(homework);
        notifyMentor(homework);
    }

    @Override
    public void addMentor(MentorKodilla mentor) {
        mentorList.add(mentor);
    }

    @Override
    public void notifyMentor(String homework) {
        for(MentorKodilla mentorKodilla: mentorList) {
            mentorKodilla.upgrade(homework, studentsName);
        }
    }

    public String getStudentsName() {
        return studentsName;
    }

    public Deque<String> getQueue() {
        return queue;
    }

    public List<MentorKodilla> getMentorList() {
        return mentorList;
    }
}
