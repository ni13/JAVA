package OverRiding;

// Base class
class Transportationn {
    public void move() {
        System.out.println("The vehicle moves in a general way.");
    }
}


class Car extends Transportationn {
    
    public void move() {
        System.out.println("The car drives on roads.");
    }
}


class Boat extends Transportationn {
    
    public void move() {
        System.out.println("The boat sails on water.");
    }
}

// Class with main method
public class TransportationTest {
    public static void main(String[] args) {
        Transportationn v1 = new Car();
        Transportationn v2 = new Boat();

        v1.move();  // Output: The car drives on roads.
        v2.move();  // Output: The boat sails on water.
    }
}
