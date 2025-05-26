package ticketSetUp;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public abstract class Ticket {
    private String source;
    private String destination;
    private String departureTime;
    private double price;
    private String marker;
    private Person person;

    protected static int capacity;
    protected static int totalTickets = 0;
    protected static List<Ticket> tickets = new ArrayList<>();

    public Ticket(Person person, String source, String destination, String departureTime, double price) {
        this.person = person;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
        this.marker = generateMarker();
    }

    // Generate marker based on ticket number + date + vehicle name
    protected String generateMarker() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String date = dateFormat.format(new Date());
        return this.getClass().getSimpleName() + date + (totalTickets + 1);
    }

    // Add ticket for a person (if capacity allows)
    public void add(Person person) {
        if (totalTickets < capacity) {
            tickets.add(this);
            totalTickets++;
            System.out.println("Ticket added successfully.");
        } else {
            System.out.println("No more tickets available.");
        }
    }

    // Overloaded add method for multiple tickets
    public void add(Person person, int n) {
        if (totalTickets + n <= capacity) {
            for (int i = 0; i < n; i++) {
                tickets.add(this);
                totalTickets++;
            }
            System.out.println(n + " tickets added successfully.");
        } else {
            System.out.println("Not enough capacity for " + n + " tickets.");
        }
    }

    // Calculate discount based on the number of tickets
    public double calculateDiscount(int numberOfTickets) {
        double discount = 0;
        if (numberOfTickets > 5) {
            discount = 0.02 + ((numberOfTickets - 5) / 5) * 0.01;
        }
        return price * numberOfTickets * (1 - discount);
    }

    // Print method
    public static void print() {
        System.out.println("Total tickets sold: " + totalTickets);
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    @Override
    public String toString() {
        return person.getName() + " " + person.getLastName() +
                ", From: " + source +
                ", To: " + destination +
                ", Departure: " + departureTime +
                ", Price: $" + price +
                ", Marker: " + marker;
    }
}

