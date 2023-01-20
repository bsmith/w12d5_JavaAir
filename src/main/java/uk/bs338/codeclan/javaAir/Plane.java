package uk.bs338.codeclan.javaAir;

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
}
