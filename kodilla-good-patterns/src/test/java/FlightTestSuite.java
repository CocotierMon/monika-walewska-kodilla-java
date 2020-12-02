import com.kodilla.good.patterns.challenges.airport.Flight;
import com.kodilla.good.patterns.challenges.airport.FlightService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class FlightTestSuite {

    FlightService flights = new FlightService();
    Flight flight;

    @Test
    public void showFlights() {
        //Given
        flights.createFlights();
        //When
        Set<Flight> flightsToKrakow;
        flightsToKrakow = flights.findFlightsTo("Krakow");

        Set<Flight> flightsFromWroclaw;
        flightsFromWroclaw = flights.findFlightsFrom("Wroclaw");

        Set<Flight> flightsViaGdansk;
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

