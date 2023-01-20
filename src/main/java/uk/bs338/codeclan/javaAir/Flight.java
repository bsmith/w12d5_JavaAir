package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.FlightFullException;
import uk.bs338.codeclan.javaAir.util.NotImplementedException;

import java.util.ArrayList;

/* TODO: Pull flight crew behaviour out into a separate class */
/* TODO: idea: rank shouldn't be an enum, but a set of isFoo methods on CrewMember */

public class Flight {
    private Pilot captain;
    private Pilot copilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane aircraft;
    private FlightDetails details;

    public Flight(FlightDetails details) {
        this.details = details;
    }

    public Pilot getCaptain() {
        return captain;
    }

    public void setCaptain(Pilot captain) {
        this.captain = captain;
    }

    public Pilot getCopilot() {
        return copilot;
    }

    public void setCopilot(Pilot copilot) {
        this.copilot = copilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrewMember> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
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

    public void bookPassenger(Passenger passenger) throws FlightFullException {
        throw new NotImplementedException();
    }
}
