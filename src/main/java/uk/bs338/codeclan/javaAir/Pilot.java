package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.NotImplementedException;

public class Pilot extends CrewMember {
    private final boolean isCaptain;
    private final String licenceNumber;

    public Pilot(String name, String licenceNumber, boolean isCaptain) {
        super(name);
        this.licenceNumber = licenceNumber;
        this.isCaptain = isCaptain;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane(Plane aircraft) {
        throw new NotImplementedException();
    }

    @Override
    public Rank getRank() {
        return isCaptain ? Rank.CAPTAIN : Rank.FIRST_OFFICER;
    }
}
