package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightCrew {
    private Pilot captain;
    private Pilot copilot;
    private ArrayList<CabinCrewMember> cabinCrew;

    public Pilot getCaptain() {
        return captain;
    }

    public Pilot getCopilot() {
        return copilot;
    }

    public void addPilot(Pilot pilot) {
        throw new NotImplementedException();
    }

    public void removePilot(Pilot captain) {
        throw new NotImplementedException();
    }

    public List<CabinCrewMember> getCabinCrew() {
        return Collections.unmodifiableList(cabinCrew);
    }

    public void addCabinCrew(CabinCrewMember crewMember) {
        this.cabinCrew.add(crewMember);
    }

    public void removeCabinCrew(CabinCrewMember crewMember) {
        this.cabinCrew.remove(crewMember);
    }

    public boolean hasPurser() {
        throw new NotImplementedException();
    }

    public List<CrewMember> getAllCrew() {
        throw new NotImplementedException();
    }
}