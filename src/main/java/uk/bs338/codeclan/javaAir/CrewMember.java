package uk.bs338.codeclan.javaAir;

public abstract class CrewMember extends NamedPerson {

    public CrewMember(String name) {
        super(name);
    }

    public abstract Rank getRank();
}
