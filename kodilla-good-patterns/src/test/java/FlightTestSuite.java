import com.kodilla.good.patterns.challenges.airport.Flight;
import com.kodilla.good.patterns.challenges.airport.FlightService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class FlightTestSuite {

    FlightService flights = new FlightService();

    @Test
    public void showFlights() {
        //Given
        flights.createFlights();
        //When
        HashSet<Flight> flightsToKrakow;
        flightsToKrakow = flights.findFlightsTo("Krakow");

        HashSet<Flight> flightsFromWroclaw;
        flightsFromWroclaw = flights.findFlightsFrom("Wroclaw");

        HashSet<Flight> flightsViaGdansk;
        flightsViaGdansk = flights.findFlightsVia("Lodz", "Gdansk", "Radom");
        //Then
        System.out.println(flightsToKrakow);
        System.out.println(flightsFromWroclaw);
        System.out.println(flightsViaGdansk);
        Assert.assertEquals(2, flightsToKrakow.size());
        Assert.assertEquals(1, flightsFromWroclaw.size());
        Assert.assertEquals(2, flightsViaGdansk.size());
    }

}

