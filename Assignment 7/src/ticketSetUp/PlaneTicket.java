package ticketSetUp;

public class PlaneTicket extends Ticket {
    private static final int CAPACITY = 150;

    static {
        capacity = CAPACITY;
    }

    public PlaneTicket(Person person, String source, String destination, String departureTime, double price) {
        super(person, source, destination, departureTime, price);
    }

    @Override
    protected String generateMarker() {
        return "Plane" + super.generateMarker();
    }
}

