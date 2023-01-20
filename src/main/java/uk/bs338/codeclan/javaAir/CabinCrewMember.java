package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.NotImplementedException;

public class CabinCrewMember extends CrewMember {
    private final boolean isPurser;

    public CabinCrewMember(String name, boolean isPurser) {
        super(name);
        this.isPurser = isPurser;
    }

    String passengerAnnouncement(Iterable<Passenger> passengers) {
        throw new NotImplementedException();
    }

    @Override
    public Rank getRank() {
        return isPurser ? Rank.PURSER : Rank.ATTENDANT;
    }
}
