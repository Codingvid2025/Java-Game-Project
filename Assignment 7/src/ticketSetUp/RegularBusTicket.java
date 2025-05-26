package ticketSetUp;

public class RegularBusTicket extends Ticket {
    private static final int CAPACITY = 50;

    static {
        capacity = CAPACITY;
    }

    public RegularBusTicket(Person person, String source, String destination, String departureTime, double price) {
        super(person, source, destination, departureTime, price);
    }

    @Override
    protected String generateMarker() {
        return "Bus" + super.generateMarker();
    }
}

