class Vehicle {
    String vehicleName;
    String vehicleType;
    String fuel;

    public void displayDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fuel: " + fuel);
    }
}

class Car extends Vehicle {
    int noOfDoors = 2;

    Car() {
        super.vehicleType = "Car";
        super.vehicleName = "Maruti swift";
        super.fuel = "diesel";
        System.out.println("No of doors: " + noOfDoors);
    }
}

class bike extends Vehicle {
    boolean hasCarrier = true;

    bike() {
        super.vehicleType = "Bike";
        super.vehicleName = "Honda";
        super.fuel = "Petrol";
        System.out.println("has Carrier: " + hasCarrier);
    }
}

public class vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        // Output:
        // No of doors: 2
        // Vehicle Name: Maruti swift
        // Vehicle Type: Car
        // Fuel: diesel

        c.displayDetails();
        bike b = new bike();
        // Output:
        // has Carrier: true
        // Vehicle Name: Honda
        // Vehicle Type: Bike
        // Fuel: Petrol

        b.displayDetails();
    }
}

// Output:
// No of doors: 2
// Vehicle Name: Maruti swift
// Vehicle Type: Car
// Fuel: diesel
// has Carrier: true
// Vehicle Name: Honda
// Vehicle Type: Bike
// Fuel: Petrol