package uk.bs338.codeclan.javaAir;

import org.junit.Before;
import org.junit.Test;
import uk.bs338.codeclan.javaAir.flights.planes.Plane;
import uk.bs338.codeclan.javaAir.flights.planes.PlaneType;

import static org.junit.Assert.*;

public class PlaneTest {
    private Plane plane;

    @Before
    public void setUp() {
        plane = new Plane("G123", PlaneType.BOEING747);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetCapacity() {
        /* 5 is from PlaneType.BOEING747 */
        assertEquals(5, plane.getCapacity(), 0);
    }

    @Test
    public void canGetTotalWeight() {
        /* 20 is from PlaneType.BOEING747 */
        assertEquals(20, plane.getTotalWeight(), 0);
    }

    @Test
    public void calculatesCorrectBaggageAllowance() {
        /* specification is that the allowance is half the total weight equally divided amongst the passengers */
        assertEquals(2, plane.getBaggageAllowancePerPerson(), 0.01);
    }
}