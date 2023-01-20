package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class FlightDetailsTest {
    private FlightDetails flightDetails;

    @Before
    public void setUp() {
        ZonedDateTime departureTime = ZonedDateTime.of(
                2023, 1, 23,
                6, 0, 0, 0,
                ZoneOffset.of("+00")
        );
        flightDetails = new FlightDetails("F001", "Glasgow", "EDI", departureTime);
    }

    @Test
    public void canCompareFlightDetails() {
        ZonedDateTime departureTime = ZonedDateTime.of(
                2023, 1, 23,
                6, 0, 0, 0,
                ZoneOffset.of("+00")
        );
        FlightDetails flightDetails2 = new FlightDetails("F001", "Glasgow", "EDI", departureTime);
        assertEquals(flightDetails2, flightDetails);
    }

    @Test
    public void canUpdateFlightDetails() {
        ZonedDateTime newTime = ZonedDateTime.of(
                2024, 2, 20,
                7, 30, 0, 0,
                ZoneOffset.of("+00")
        );
        FlightDetails updatedDetails = flightDetails
                .withNumber("F002")
                .withDestination("London")
                .withDepartureAirport("GLA")
                .withDepartureTime(newTime);
        assertEquals("F002", updatedDetails.getNumber());
        assertEquals("London", updatedDetails.getDestination());
        assertEquals("GLA", updatedDetails.getDepartureAirport());
        assertEquals(newTime, updatedDetails.getDepartureTime());
    }
}