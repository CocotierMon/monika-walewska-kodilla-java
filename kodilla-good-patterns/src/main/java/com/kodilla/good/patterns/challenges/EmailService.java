package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService{
    @Override
    public void inform(User user, Product product) {
        System.out.println("Wiadomość e-mail do użytkownika: Użytkownik: " + user + "stworzył nowe zamówienie: " + product + ".");
    }
}
