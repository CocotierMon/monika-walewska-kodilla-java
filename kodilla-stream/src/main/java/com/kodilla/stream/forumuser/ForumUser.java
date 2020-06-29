package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    public LocalDate dateOfBirth;
    private final int numOfPosts;

    public ForumUser(int id, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numOfPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numOfPosts = numOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
       return dateOfBirth;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    @Override
    public String toString() {
        return "Forumuser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numOfPosts=" + numOfPosts +
                '}';
    }
}
