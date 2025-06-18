package Inheritance1;

class Vehicle {
    String make, model;
    int year;
}

class Car extends Vehicle {
    int trunkCapacity;

    void display() {
        System.out.println("[Car]");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Trunk Capacity: " + trunkCapacity + " L");
    }
}

class Truck extends Vehicle {
    String loadCapacity;

    void display() {
        System.out.println("[Truck]");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.make = "Volvo";
        truck.model = "X750";
        truck.year = 2020;
        truck.loadCapacity = "15 Tons";
        truck.display();
    }
}
