package uk.bs338.codeclan.javaAir.flights;

import uk.bs338.codeclan.javaAir.people.CabinCrewMember;
import uk.bs338.codeclan.javaAir.people.CrewMember;
import uk.bs338.codeclan.javaAir.people.Pilot;
import uk.bs338.codeclan.javaAir.people.Rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightCrew {
    private Pilot captain;
    private Pilot copilot;
    private final ArrayList<CabinCrewMember> cabinCrew;

    public FlightCrew() {
        this.cabinCrew = new ArrayList<>();
    }

    public Pilot getCaptain() {
        return captain;
    }

    public Pilot getCopilot() {
        return copilot;
    }

    public void addPilot(Pilot pilot) {
        if (captain == null && pilot.getRank() == Rank.CAPTAIN) {
            captain = pilot;
        } else if (copilot == null) {
            copilot = pilot;
        }
    }

    public void removePilot(Pilot pilot) {
        if (pilot == null)
            return;
        if (captain != null && captain.equals(pilot))
            captain = null;
        if (copilot != null && copilot.equals(pilot))
            copilot = null;
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
        for (CrewMember crewMember : this.cabinCrew)
            if (crewMember.getRank() == Rank.PURSER)
                return true;
        return false;
    }

    public List<CrewMember> getAllCrew() {
        ArrayList<CrewMember> allCrew = new ArrayList<>();
        if (this.captain != null)
            allCrew.add(this.captain);
        if (this.copilot != null)
            allCrew.add(this.copilot);
        allCrew.addAll(this.cabinCrew);
        return allCrew;
    }
}