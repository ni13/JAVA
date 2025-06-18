package OverRiding;


class Order {
 public void processOrder() {
     System.out.println("Processing general order...");
 }
}

class OnlineOrder extends Order {

 public void processOrder() {
     System.out.println("Processing online order with digital invoice...");
 }
}

class InStoreOrder extends Order {

 public void processOrder() {
     System.out.println("Processing in-store order with printed receipt...");
 }
}

public class Ordertest {
 public static void main(String[] args) {
     Order o1 = new OnlineOrder();
     Order o2 = new InStoreOrder();

     o1.processOrder();  
     o2.processOrder();  
 }
}
