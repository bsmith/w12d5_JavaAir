package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.NotImplementedException;

public class CabinCrewMember extends CrewMember {
    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    String passengerAnnouncement(Iterable<Passenger> passengers) {
        throw new NotImplementedException();
    }

    @Override
    public boolean checkRankValid() {
        throw new NotImplementedException();
    }
}
