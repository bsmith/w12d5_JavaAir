package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Test;
import uk.bs338.codeclan.javaAir.flights.Flight;
import uk.bs338.codeclan.javaAir.flights.FlightDetails;
import uk.bs338.codeclan.javaAir.people.crew.CabinCrewMember;
import uk.bs338.codeclan.javaAir.people.crew.CrewMember;
import uk.bs338.codeclan.javaAir.people.Passenger;
import uk.bs338.codeclan.javaAir.people.crew.Pilot;
import uk.bs338.codeclan.javaAir.flights.planes.Plane;
import uk.bs338.codeclan.javaAir.flights.planes.PlaneType;
import uk.bs338.codeclan.javaAir.util.FlightFullException;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;
    private Passenger passengerWithFiveBags;
    private Passenger passengerWithOneBag;
    private CabinCrewMember purser;
    private CabinCrewMember attendant;
    private Pilot captain;
    private Pilot firstOfficer;

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
        purser = new CabinCrewMember("Purser", true);
        attendant = new CabinCrewMember("Attendant", false);
        captain = new Pilot("Pilot 1", "P1", true);
        firstOfficer = new Pilot("Pilot 2", "P2", false);
    }

    @Test
    public void canSetFlightCrew() {
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

//    @Test(expected = NotImplementedException.class)
    @Test
    public void flightStartsEmpty() {
        assertEquals(5, flight.getAvailableSeats());
    }

//    @Test(expected = NotImplementedException.class)
    @Test
    public void availableSeatsDecreases() throws FlightFullException {
        assertTrue(flight.bookPassenger(passengerWithOneBag));
        assertEquals(4, flight.getAvailableSeats());
    }

    @Test
    public void passengersAddedToList() throws FlightFullException {
        assertTrue(flight.bookPassenger(passengerWithOneBag));
        assertSame(passengerWithOneBag, flight.getPassengers().get(0));
    }

//    @Test(expected = NotImplementedException.class)
    @Test
    public void cannotBookPassengerWithTooManyBags() throws FlightFullException {
        flight.bookPassenger(passengerWithOneBag);
        assertFalse(flight.bookPassenger(passengerWithFiveBags));
        assertEquals(4, flight.getAvailableSeats());
    }

//    @Test(expected = NotImplementedException.class)
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
        fail("bookPassenger should have thrown exception");
    }

    @Test
    public void canChangeAircraft() {
        Plane replacementAircraft = new Plane("G987", PlaneType.BOEING747);
        flight.setAircraft(replacementAircraft);
        assertSame(flight.getAircraft(), replacementAircraft);
    }

    @Test
    public void delegatesCabinCrewTasks() {
        flight.addCabinCrew(purser);
        flight.addCabinCrew(attendant);
        flight.removeCabinCrew(purser);
        assertFalse(flight.getCabinCrew().contains(purser));
        assertTrue(flight.getCabinCrew().contains(attendant));
        assertFalse(flight.hasPurser());
    }

    @Test
    public void delegatesPilotTasks() {
        flight.addPilot(captain);
        flight.addPilot(firstOfficer);
        flight.removePilot(captain);
        assertNull(flight.getCaptain());
        assertSame(firstOfficer, flight.getCopilot());
    }

    @Test
    public void canUpdateFlightDetails() {
        FlightDetails newDetails = flight.getDetails()
                        .withDestination("London");
        flight.setDetails(newDetails);
        assertEquals(newDetails, flight.getDetails());
    }
}