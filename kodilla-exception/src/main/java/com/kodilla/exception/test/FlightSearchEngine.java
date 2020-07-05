package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearchEngine {

    HashMap<String, Boolean> airport;

    public FlightSearchEngine(HashMap<String, Boolean> airport) {
        this.airport = airport;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airport.containsKey(flight.getArrivalAirport())) {
            if (airport.get(flight.getArrivalAirport())){
                System.out.println("Znaleziono połączenie z " + flight.getDepartureAirport() + " do " + flight.getArrivalAirport());
            } else
            System.out.println("Niestety, lot z " + flight.getDepartureAirport() + " do " + flight.getArrivalAirport() + " jest obecnie niemozliwy.");
        } else {
            throw new RouteNotFoundException("Nie znaleziono lotniska.");
            }
        }

    public static void main(String[] args){

        Flight flight = new Flight("KRK", "AMS");
        Flight flight1 = new Flight("GDN", "DUB");
        Flight flight2 = new Flight("ROM", "PMO");
        Flight flight3 = new Flight("SZZ", "RZE");

        HashMap<String, Boolean> airport = new HashMap<>();

        airport.put("KRK",true);
        airport.put("GDN",false);
        airport.put("ROM",true);
        airport.put("LDZ",false);

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(airport);

        try{
            flightSearchEngine.findFlight(flight3);
        } catch (RouteNotFoundException e){}
    }

}

