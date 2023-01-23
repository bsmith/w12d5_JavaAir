package uk.bs338.codeclan.javaAir.people.crew;

import uk.bs338.codeclan.javaAir.people.NamedPerson;

public abstract class CrewMember extends NamedPerson {

    public CrewMember(String name) {
        super(name);
    }

    public abstract Rank getRank();
}
