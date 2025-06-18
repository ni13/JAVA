package Encapsulation;

public class CarRental {
  
    private String model;
    private String resgNo;
    private boolean isAvailable;
    
    public CarRental(String model, String resgNo, boolean isAvailable) {
        this.model = model;
        this.resgNo = resgNo;
        this.isAvailable = isAvailable;
    }

    public String getModel() {
        return model;
    }

    public String getResgNo() {
        return resgNo;
    }

    public boolean isAvailable() {
        return isAvailable; 
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false; // mark it as rented
            System.out.println(model + " " + resgNo + " is available.");
        } else {
            System.out.println(model + " " + resgNo + " is already taken.");
        }
    }

    public static void main(String[] args) {
        CarRental obj = new CarRental("Tata", "TN4052632431", true);
        
        System.out.println("Car Model: " + obj.getModel());
        System.out.println("Reg No: " + obj.getResgNo());
        System.out.println("Is it available? : " + obj.isAvailable());
        
        obj.rentCar(); // try renting
    }
}
