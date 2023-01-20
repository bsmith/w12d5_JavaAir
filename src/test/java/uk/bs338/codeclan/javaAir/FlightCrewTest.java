package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FlightCrewTest {
    private FlightCrew flightCrew;
    private Pilot captain;
    private Pilot firstOfficer;
    private CabinCrewMember purser;
    private CabinCrewMember attendant;

    @Before
    public void setUp() {
        captain = new Pilot("Pilot 1", "P1", true);
        firstOfficer = new Pilot("Pilot 2", "P2", false);
        purser = new CabinCrewMember("Purser", true);
        attendant = new CabinCrewMember("Attendant", false);

        flightCrew = new FlightCrew();
    }

    @Test
    public void canSetCaptainAndFirstOfficer() {
        flightCrew.addPilot(captain);
        flightCrew.addPilot(firstOfficer);
        assertEquals(captain, flightCrew.getCaptain());
        assertEquals(firstOfficer, flightCrew.getCopilot());
    }

    @Test
    public void cannotSetFirstOfficerAsCaptain() {
        flightCrew.addPilot(firstOfficer);
        assertNull(flightCrew.getCaptain());
        assertEquals(firstOfficer, flightCrew.getCopilot());
    }

    @Test
    public void canFlyWithTwoCaptains() {
        Pilot captain2 = new Pilot("Captain 2", "P3", true);
        flightCrew.addPilot(captain);
        flightCrew.addPilot(captain2);
        assertEquals(captain, flightCrew.getCaptain());
        assertEquals(captain2, flightCrew.getCopilot());
    }

    @Test
    public void canRemoveCaptain() {
        flightCrew.addPilot(captain);
        flightCrew.addPilot(firstOfficer);
        flightCrew.removePilot(captain);
        assertNull(flightCrew.getCaptain());
        assertEquals(firstOfficer, flightCrew.getCopilot());
    }

    @Test
    public void canRemoveFirstOfficer() {
        flightCrew.addPilot(captain);
        flightCrew.addPilot(firstOfficer);
        flightCrew.removePilot(firstOfficer);
        assertEquals(captain, flightCrew.getCaptain());
        assertNull(flightCrew.getCopilot());
    }

    @Test
    public void canRemoveFirstOfficerWhenOnlyOnePilotAboard() {
        flightCrew.addPilot(firstOfficer);
        flightCrew.removePilot(firstOfficer);
        assertNull(flightCrew.getCaptain());
        assertNull(flightCrew.getCopilot());
    }

    @Test
    public void canAddCabinCrew() {
        flightCrew.addCabinCrew(purser);
        flightCrew.addCabinCrew(attendant);
        assertArrayEquals(new CabinCrewMember[]{purser, attendant}, flightCrew.getCabinCrew().toArray());
    }

    /* can remove cabin crew member */
    @Test
    public void canRemoveCabinCrew() {
        flightCrew.addCabinCrew(purser);
        flightCrew.addCabinCrew(attendant);
        flightCrew.removeCabinCrew(purser);
        assertArrayEquals(new CabinCrewMember[]{attendant}, flightCrew.getCabinCrew().toArray());
    }

    /* can check for purser aboard, purser present */
    @Test
    public void hasPurser() {
        flightCrew.addCabinCrew(purser);
        flightCrew.addCabinCrew(attendant);
        assertTrue(flightCrew.hasPurser());
    }

    /* can check for purser aboard, purser not present */
    @Test
    public void hasNotPurser() {
        flightCrew.addCabinCrew(attendant);
        assertFalse(flightCrew.hasPurser());
    }

    /* can get all crew */
    @Test
    public void canGetAllCrew() {
        flightCrew.addPilot(captain);
        flightCrew.addPilot(firstOfficer);
        flightCrew.addCabinCrew(purser);
        flightCrew.addCabinCrew(attendant);
        List<CrewMember> allCrew = flightCrew.getAllCrew();
        assertEquals(4, allCrew.size());
        assertTrue(allCrew.contains(captain));
        assertTrue(allCrew.contains(firstOfficer));
        assertTrue(allCrew.contains(purser));
        assertTrue(allCrew.contains(attendant));
    }
}