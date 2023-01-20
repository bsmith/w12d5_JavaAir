package uk.bs338.codeclan.javaAir;

public abstract class CrewMember extends NamedPerson {
    private final Rank rank;

    public CrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
        this.checkRankValid();
    }

    public Rank getRank() {
        return rank;
    }

    public abstract boolean checkRankValid();
}
