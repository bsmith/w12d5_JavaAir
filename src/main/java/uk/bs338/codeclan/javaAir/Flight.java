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

    public Flight(FlightDetails details) {
        this.flightCrew = new FlightCrew();
        this.details = details;
    }

    public Pilot getCaptain() {
        return flightCrew.getCaptain();
    }

    public void setCaptain(Pilot captain) {
        this.flightCrew.setCaptain(captain);
    }

    public Pilot getCopilot() {
        return flightCrew.getCopilot();
    }

    public void setCopilot(Pilot copilot) {
        this.flightCrew.setCopilot(copilot);
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return flightCrew.getCabinCrew();
    }

    public void setCabinCrew(List<CabinCrewMember> cabinCrew) {
        this.flightCrew.setCabinCrew(cabinCrew);
    }

    public List<Passenger> getPassengers() {
        return Collections.unmodifiableList(passengers);
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = new ArrayList<>(passengers);
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
