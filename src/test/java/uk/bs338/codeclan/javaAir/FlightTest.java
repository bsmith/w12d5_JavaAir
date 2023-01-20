package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;

    @Before
    public void setUp() {
        ZonedDateTime departureTime = ZonedDateTime.of(
                2023, 1, 23,
                6, 0, 0, 0,
                ZoneOffset.of("+00")
        );
        flight = new Flight(
                new FlightDetails("F001", "Glasgow", "EDI", departureTime),
                new Plane("G567", PlaneType.BOEING747)
        );
    }

    @Ignore
    @Test
    public void flightStartsEmpty() {
        assertEquals(5, flight.getAvailableSeats());
    }

    @Ignore
    @Test
    public void bookPassenger() {
    }
}