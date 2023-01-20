package uk.bs338.codeclan.javaAir;

public enum PlaneType {
    BOEING747(5, 20);

    private final double capacity;
    private final double totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
