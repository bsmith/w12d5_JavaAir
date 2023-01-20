package uk.bs338.codeclan.javaAir;

import java.time.ZonedDateTime;
import java.util.Objects;

/* a pattern for updating values one-by-one in an immutable record:
  https://stackoverflow.com/a/65254270/19859074
 */

public class FlightDetails {
    private final String number;
    private final String destination;
    private final String departureAirport;
    private final ZonedDateTime departureTime;

    public FlightDetails(String number, String destination, String departureAirport, ZonedDateTime departureTime) {
        this.number = number;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    /* generate code is ... nice? */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDetails that = (FlightDetails) o;
        return number.equals(that.number) && destination.equals(that.destination) && departureAirport.equals(that.departureAirport) && departureTime.equals(that.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, destination, departureAirport, departureTime);
    }

    public String getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public FlightDetails withNumber(String number) {
        return new FlightDetails(number, this.destination, this.departureAirport, this.departureTime);
    }

    public FlightDetails withDestination(String destination) {
        return new FlightDetails(this.number, destination, this.departureAirport, this.departureTime);
    }

    public FlightDetails withDepartureAirport(String departureAirport) {
        return new FlightDetails(this.number, this.destination, departureAirport, this.departureTime);
    }

    public FlightDetails withDepartureTime(ZonedDateTime departureTime) {
        return new FlightDetails(this.number, this.destination, this.departureAirport, departureTime);
    }
}
