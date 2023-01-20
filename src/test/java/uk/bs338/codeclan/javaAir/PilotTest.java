package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import uk.bs338.codeclan.javaAir.util.NotImplementedException;

import static org.junit.Assert.*;

public class PilotTest {

    @Ignore
    @Test
    public void flyPlane() {
        throw new NotImplementedException();
    }

    @Test
    public void correctRankForCaptain() {
        Pilot captain = new Pilot("Alice", "AAA123", true);
        assertEquals(Rank.CAPTAIN, captain.getRank());
    }

    @Test
    public void correctRankForNonCaptain() {
        Pilot firstOfficer = new Pilot("Beth", "BBB456", false);
        assertEquals(Rank.FIRST_OFFICER, firstOfficer.getRank());
    }
}