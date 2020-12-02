package com.kodilla.good.patterns.challenges.airport;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    private final HashSet<Flight> flights;

    public FlightService() {
        this.flights = createFlights();
    }

    public HashSet<Flight> createFlights() {
        HashSet<Flight> flights = new HashSet<>();
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Krakow", "Gdansk"));
        flights.add(new Flight("Krakow", "Wroclaw"));
        flights.add(new Flight("Wroclaw", "Krakow"));
        flights.add(new Flight("Lodz", "Rzeszow"));
        flights.add(new Flight("Rzeszow", "Lodz"));
        flights.add(new Flight("Lodz", "Gdansk"));
        flights.add(new Flight("Gdansk", "Lodz"));
        flights.add(new Flight("Gdansk", "Radom"));
        flights.add(new Flight("Radom", "Gdansk"));
        return flights;
    }

    public Set<Flight> findFlightsFrom(String departure) {
        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightsTo(String arrival) {
        return flights.stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toSet());
        }

    public Set<Flight> findFlightsVia(String departure, String via, String arrival) {
        Set<Flight> fromDeparture = findFlightsFrom(departure).stream().filter(f -> f.getArrival().equals(via))
                .collect(Collectors.toSet());
        Set<Flight> toArrival = findFlightsTo(arrival).stream().filter(f -> f.getDeparture().equals(via))
                .collect(Collectors.toSet());
        Set<Flight> flightsVia = new HashSet<>();
        flightsVia.addAll(fromDeparture);
        flightsVia.addAll(toArrival);
        return flightsVia;
    }
}

