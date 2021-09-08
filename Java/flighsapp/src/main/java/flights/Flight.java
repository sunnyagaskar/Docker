package flights;

public class Flight {

    private final String flightNumber;
    private final String departurePort;
    private final String arrivalPort;
    private final String departureTime;
    private final String arrivalTime;

    public Flight(String flightNumber, String departurePort, String arrivalPort, String departureTime, String arrivalTime) {

        this.flightNumber = flightNumber;
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getflightNumber() {
        return this.flightNumber;
    }

    public String getdeparturePort() {
        return this.departurePort;
    }

    public String getarrivalPort() {
        return this.arrivalPort;
    }

    public String getdepartureTime() {
        return this.departureTime;
    }

    public String getarrivalTime() {
        return this.arrivalTime;
    }

}