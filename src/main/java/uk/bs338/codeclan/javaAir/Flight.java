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

    public void bookPassenger(Passenger passenger) throws FlightFullException {
        throw new NotImplementedException();
    }
}
