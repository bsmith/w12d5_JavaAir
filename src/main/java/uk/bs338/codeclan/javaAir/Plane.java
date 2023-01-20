package uk.bs338.codeclan.javaAir;

import uk.bs338.codeclan.javaAir.util.NotImplementedException;

public class Plane {
    private final String registration;
    private final PlaneType type;

    public Plane(String registration, PlaneType type) {
        this.registration = registration;
        this.type = type;
    }

    public String getRegistration() {
        return registration;
    }

    public PlaneType getType() {
        return type;
    }

    public double getCapacity() {
        return type.getCapacity();
    }

    public double getTotalWeight() {
        return type.getTotalWeight();
    }

    public double getBaggageAllowancePerPerson() {
        return this.getTotalWeight() / 2 / this.getCapacity();
    }
}
