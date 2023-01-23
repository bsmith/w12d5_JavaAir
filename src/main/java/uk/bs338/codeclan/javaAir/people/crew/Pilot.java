package uk.bs338.codeclan.javaAir.people.crew;

import uk.bs338.codeclan.javaAir.flights.planes.Plane;

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
        return String.format("%s with licence %s is flying plane %s",
                this.getName(), this.getLicenceNumber(), aircraft.getRegistration());
    }

    @Override
    public Rank getRank() {
        return isCaptain ? Rank.CAPTAIN : Rank.FIRST_OFFICER;
    }
}
