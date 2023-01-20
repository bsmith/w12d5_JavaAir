package uk.bs338.codeclan.javaAir;

import java.util.ArrayList;
import java.util.List;

public class FlightCrew {
    private Pilot captain;

    public Pilot getCaptain() {
        return captain;
    }

    public void setCaptain(Pilot captain) {
        this.captain = captain;
    }

    private Pilot copilot;

    public Pilot getCopilot() {
        return copilot;
    }

    public void setCopilot(Pilot copilot) {
        this.copilot = copilot;
    }

    private ArrayList<CabinCrewMember> cabinCrew;

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(List<CabinCrewMember> cabinCrew) {
        this.cabinCrew = new ArrayList<>(cabinCrew);
    }

    public FlightCrew() {
    }
}