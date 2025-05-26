package ticketSetUp;

public class TrainTicket extends Ticket {
    private static final int CAPACITY = 400;

    static {
        capacity = CAPACITY;
    }

    public TrainTicket(Person person, String source, String destination, String departureTime, double price) {
        super(person, source, destination, departureTime, price);
    }

    @Override
    protected String generateMarker() {
        return "Train" + super.generateMarker();
    }
}

