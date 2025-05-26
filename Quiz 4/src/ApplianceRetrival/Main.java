package ApplianceRetrival;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Washing Machine
        WashingMachine wm = new WashingMachine("LG", 2000, 2);
        wm.setDrumSize(7.5);
        wm.setType("Front-load");
        wm.displayDetails();

        // Create Refrigerator
        Refrigerator fridge = new Refrigerator("Samsung", 150, 3);
        fridge.setCoolingCapacity(350);
        fridge.setNumberOfDoors(2);
        fridge.displayDetails();

        // Create Microwave
        Microwave microwave = new Microwave("Panasonic", 1200, 1);
        microwave.setHeatingPower(1000);
        microwave.setMicrowaveType("Convection");
        microwave.displayDetails();

        scanner.close();
    }
}

