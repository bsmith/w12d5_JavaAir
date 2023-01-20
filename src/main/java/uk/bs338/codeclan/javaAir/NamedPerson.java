package uk.bs338.codeclan.javaAir;

public abstract class NamedPerson {
    private final String name;

    public NamedPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
