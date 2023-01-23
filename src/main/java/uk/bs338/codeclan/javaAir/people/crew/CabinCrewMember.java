package uk.bs338.codeclan.javaAir.people.crew;

import uk.bs338.codeclan.javaAir.people.Passenger;

import java.util.Iterator;

public class CabinCrewMember extends CrewMember {
    private final boolean isPurser;

    public CabinCrewMember(String name, boolean isPurser) {
        super(name);
        this.isPurser = isPurser;
    }

    static void buildPassengerList(StringBuilder builder, Iterable<Passenger> passengers) {
        Iterator<Passenger> iter = passengers.iterator();
        while (iter.hasNext()) {
            Passenger passenger = iter.next();
            if (!iter.hasNext())
                builder.append("and ");
            builder.append(passenger.getName());
            if (iter.hasNext())
                builder.append(", ");
        }
    }

    public String passengerAnnouncement(Iterable<Passenger> passengers) {
        StringBuilder message = new StringBuilder();
        message.append("Welcome about this flight! I'm ");
        message.append(getName());
        message.append(". ");
        message.append("Today we have aboard: ");
        buildPassengerList(message, passengers);
        return message.toString();
    }

    @Override
    public Rank getRank() {
        return isPurser ? Rank.PURSER : Rank.ATTENDANT;
    }
}
