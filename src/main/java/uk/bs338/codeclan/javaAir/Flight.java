package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.FlightFullException;
import uk.bs338.codeclan.javaAir.util.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {
    private final FlightCrew flightCrew;
    private ArrayList<Passenger> passengers;
    private Plane aircraft;
    private FlightDetails details;

    public Flight(FlightDetails details, Plane aircraft) {
        this.flightCrew = new FlightCrew();
        this.aircraft = aircraft;
        this.details = details;
    }

    public Pilot getCaptain() {
        return flightCrew.getCaptain();
    }

    public void addPilot(Pilot pilot) {
        this.flightCrew.addPilot(pilot);
    }

    public Pilot getCopilot() {
        return flightCrew.getCopilot();
    }

    public List<CabinCrewMember> getCabinCrew() {
        return flightCrew.getCabinCrew();
    }

    public void removePilot(Pilot captain) {
        flightCrew.removePilot(captain);
    }

    public void addCabinCrew(CabinCrewMember crewMember) {
        flightCrew.addCabinCrew(crewMember);
    }

    public void removeCabinCrew(CabinCrewMember crewMember) {
        flightCrew.removeCabinCrew(crewMember);
    }

    public boolean hasPurser() {
        return flightCrew.hasPurser();
    }

    public List<CrewMember> getAllCrew() {
        return flightCrew.getAllCrew();
    }

    public List<Passenger> getPassengers() {
        return Collections.unmodifiableList(passengers);
    }

    public Plane getAircraft() {
        return aircraft;
    }

    public void setAircraft(Plane aircraft) {
        this.aircraft = aircraft;
    }

    public FlightDetails getDetails() {
        return details;
    }

    public void setDetails(FlightDetails details) {
        this.details = details;
    }

    public int getAvailableSeats() {
        throw new NotImplementedException();
    }

    /* If the passenger has too many bags, return false, otherwise, book the passenger
      unless the plane is full, in which case throw an exception because callers
      should have checked getAvailableSeats first.
     */
    public boolean bookPassenger(Passenger passenger) throws FlightFullException {
        throw new NotImplementedException();
    }
}
