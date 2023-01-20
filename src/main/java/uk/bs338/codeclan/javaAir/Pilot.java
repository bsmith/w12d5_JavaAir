package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.NotImplementedException;

public class Pilot extends CrewMember {
    private final String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane(Plane aircraft) {
        throw new NotImplementedException();
    }

    @Override
    public boolean checkRankValid() {
        throw new NotImplementedException();
    }
}
