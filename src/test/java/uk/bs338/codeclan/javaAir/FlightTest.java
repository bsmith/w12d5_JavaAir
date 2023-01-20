package uk.bs338.codeclan.javaAir;

import junit.framework.AssertionFailedError;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import uk.bs338.codeclan.javaAir.util.FlightFullException;
import uk.bs338.codeclan.javaAir.util.NotImplementedException;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;
    private Passenger passengerWithFiveBags;
    private Passenger passengerWithOneBag;

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
        passengerWithFiveBags = new Passenger("Keith", 3);
        passengerWithOneBag = new Passenger("Mar", 1);
    }

    @Ignore
    @Test
    public void canSetFlightCrew() {
        Pilot captain = new Pilot("Pilot 1", "P1", true);
        Pilot firstOfficer = new Pilot("Pilot 2", "P2", false);
        CabinCrewMember purser = new CabinCrewMember("Purser", true);
        CabinCrewMember attendant = new CabinCrewMember("Attendant", false);
        flight.addPilot(firstOfficer);
        flight.addPilot(captain);
        flight.addCabinCrew(attendant);
        flight.addCabinCrew(purser);
        List<CrewMember> allCrew = flight.getAllCrew();
        assertEquals(4, allCrew.size());
        assertTrue(allCrew.contains(captain));
        assertTrue(allCrew.contains(firstOfficer));
        assertTrue(allCrew.contains(purser));
        assertTrue(allCrew.contains(attendant));
    }

    @Ignore
    @Test
    public void flightStartsEmpty() {
        assertEquals(5, flight.getAvailableSeats());
    }

    @Ignore
    @Test
    public void availableSeatsDecreases() throws FlightFullException {
        assertTrue(flight.bookPassenger(passengerWithOneBag));
        assertEquals(4, flight.getAvailableSeats());
    }

    @Ignore
    @Test
    public void cannotBookPassengerWithTooManyBags() throws FlightFullException {
        flight.bookPassenger(passengerWithOneBag);
        assertFalse(flight.bookPassenger(passengerWithFiveBags));
        assertEquals(4, flight.getAvailableSeats());
    }

    /* Flights start empty */
    /* Flights have a capacity for passengers */
    /* Must not exceed the baggage allowance per person */

    @Ignore
    @Test
    public void cannotExceedCapacityForPassengers() {
        try {
            for (int i = 0; i < 5; i++) {
                flight.bookPassenger(new Passenger("Dolly", 0));
            }
        }
        catch (FlightFullException e) {
            throw new AssertionError("Flight shouldn't be full yet", e);
        }
        try {
            flight.bookPassenger(new Passenger("Dolly", 0));
        }
        catch (FlightFullException e) {
            /* We're testing that it does throw an exception */
            return;
        }
        assertFalse(true);
    }
}