package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {
    Pilot captain;
    Pilot firstOfficer;

    @Before
    public void setUp() {
        captain = new Pilot("Alice", "AAA123", true);
        firstOfficer = new Pilot("Beth", "BBB456", false);
    }

    @Test
    public void flyPlane() {
        Plane plane = new Plane("G123", PlaneType.BOEING747);
        String message = captain.flyPlane(plane);
        /* message must contain the pilot's licenceNumber and name and the plane's registration*/
        assertTrue(message.contains(captain.getLicenceNumber()));
        assertTrue(message.contains(captain.getName()));
        assertTrue(message.contains(plane.getRegistration()));
    }

    @Test
    public void correctRankForCaptain() {
        assertEquals(Rank.CAPTAIN, captain.getRank());
    }

    @Test
    public void correctRankForNonCaptain() {
        assertEquals(Rank.FIRST_OFFICER, firstOfficer.getRank());
    }
}