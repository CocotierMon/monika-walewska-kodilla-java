package com.kodilla.good.patterns.challenges.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    List<Flight> flights;

    public FlightService() {
        this.flights = createFlights();
    }

    public List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();
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

    public List<Flight> findFlightsFrom(String departure) {
        return flights.stream()
               .filter(flight -> flight.getDeparture().equals(departure)).collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return flights.stream()
                .filter(flight -> flight.getArrival().equals(arrival)).collect(Collectors.toList());
    }

    public List<Flight> findFlightsVia(String departure, String via, String arrival) {
        List<Flight> fromDeparture = findFlightsFrom(departure).stream().filter(f -> f.getArrival().equals(via))
                .collect(Collectors.toList());
        List<Flight> toArrival = findFlightsTo(arrival).stream().filter(f -> f.getDeparture().equals(via))
                .collect(Collectors.toList());
        List<Flight> flightsVia = new ArrayList<>();
        flightsVia.addAll(fromDeparture);
        flightsVia.addAll(toArrival);
        return flightsVia;
    }
}
