package com.kodilla.good.patterns.challenges.food2door;

public class User {

    private String name;
    private String surname;
    private String email;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "imię: " + name +
                ", nazwisko: " + surname +
                ", email: " + email;
    }
}
