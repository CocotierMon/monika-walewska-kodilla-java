package com.kodilla.exception.test;

public class Flight {
    String arrivalAirport;
    String departureAirport;

    public Flight(String arrivalAirport, String departureAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
