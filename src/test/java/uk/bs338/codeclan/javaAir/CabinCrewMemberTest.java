package uk.bs338.codeclan.javaAir;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {

    @Test
    public void canMakePassengerAnnouncement() {
        CabinCrewMember crewMember = new CabinCrewMember("Eric", false);
        String announcement = crewMember.passengerAnnouncement(Collections.singletonList(
                new Passenger("Elvis", 2)
        ));
        assertTrue(announcement.contains("Eric"));
        assertTrue(announcement.contains("Elvis"));
    }

    @Test
    public void canMakePassengerAnnouncementWithMultiplePassengers() {
        /* Check the output puts commas and "ands" in the right places */
        CabinCrewMember crewMember = new CabinCrewMember("Eric", false);
        String announcement = crewMember.passengerAnnouncement(Arrays.asList(
                new Passenger("P1", 2),
                new Passenger("P2", 2),
                new Passenger("P3", 2)
        ));
        assertTrue(announcement.contains("P1, P2, and P3"));
    }

    @Test
    public void correctRankForPurser() {
        CabinCrewMember purser = new CabinCrewMember("Charlie", true);
        assertEquals(Rank.PURSER, purser.getRank());
    }

    @Test
    public void correctRankForNonPurser() {
        CabinCrewMember crew = new CabinCrewMember("David", false);
        assertEquals(Rank.ATTENDANT, crew.getRank());
    }
}