package ticketSetUp;

public class VipBusTicket extends Ticket {
    private static final int CAPACITY = 25;

    static {
        capacity = CAPACITY;
    }

    public VipBusTicket(Person person, String source, String destination, String departureTime, double price) {
        super(person, source, destination, departureTime, price);
    }

    @Override
    protected String generateMarker() {
        return "VipBus" + super.generateMarker();
    }
}

