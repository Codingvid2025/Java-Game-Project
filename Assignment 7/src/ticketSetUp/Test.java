package ticketSetUp;

public class Test {
    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("John", "Doe", "123456789");
        Person person2 = new Person("Jane", "Smith", "987654321");
        Person person3 = new Person("Alice", "Johnson", "555555555");

        // Create Train Tickets
        TrainTicket trainTicket1 = new TrainTicket(person1, "New York", "Boston", "10:00 AM", 100.0);
        TrainTicket trainTicket2 = new TrainTicket(person2, "Chicago", "Seattle", "2:00 PM", 150.0);
        trainTicket1.add(person1);
        trainTicket2.add(person2);

        // Create Plane Tickets
        PlaneTicket planeTicket1 = new PlaneTicket(person1, "Los Angeles", "Miami", "8:00 AM", 300.0);
        PlaneTicket planeTicket2 = new PlaneTicket(person3, "San Francisco", "Dallas", "4:30 PM", 280.0);
        planeTicket1.add(person1);
        planeTicket2.add(person3);

        // Create Regular Bus Tickets
        RegularBusTicket busTicket1 = new RegularBusTicket(person2, "Houston", "Austin", "9:15 AM", 50.0);
        busTicket1.add(person2);

        // Create VIP Bus Tickets
        VipBusTicket vipBusTicket1 = new VipBusTicket(person3, "Washington", "Philadelphia", "11:30 AM", 120.0);
        vipBusTicket1.add(person3);

        // Test Overloaded add method (buying multiple tickets)
        trainTicket1.add(person1, 6); // Should apply discount for 6 tickets

        // Print all tickets and total amount after discount
        Ticket.print();
    }
}

