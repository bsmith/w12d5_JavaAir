package uk.bs338.codeclan.javaAir;

public class Passenger extends NamedPerson {
    private final int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
