package OOPS;

// Car.java
class Car {
    // Data members (fields)
    private String make;
    private String model;
    private int year;
    private double mileage;

    // Constructor
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Mileage: " + mileage + " miles");
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}


public class OOPsExamples {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2021, 15000);

        // Display car information
        myCar.displayCarInfo();

        // Modify the car's mileage
        myCar.setMileage(16000);

        // Display updated car information
        System.out.println("\nAfter updating mileage:");
        myCar.displayCarInfo();

    }
}
