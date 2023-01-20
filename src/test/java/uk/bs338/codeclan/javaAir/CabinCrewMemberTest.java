package uk.bs338.codeclan.javaAir;

import org.junit.Ignore;
import org.junit.Test;
import uk.bs338.codeclan.javaAir.util.NotImplementedException;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {

    @Ignore
    @Test
    public void passengerAnnouncement() {
        throw new NotImplementedException();
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