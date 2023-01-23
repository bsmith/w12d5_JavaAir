package uk.bs338.codeclan.javaAir.planes;

public enum PlaneType {
    BOEING747(5, 20);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
