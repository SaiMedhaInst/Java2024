package OOPS;

class Mobile {
    // Data members
    String name;
    String model;
    double price;

    // no constructor , no setter & getters , no methods defined
}

// Car.java
class Car {
    // Data members (fields)
    private String make;
    private String model;
    private int year;
    private double mileage;

    // Constructor
    public Car(String make, String model, int year, double mileage) { // parameterized constructor
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

    public String getModel() { // getter method for Model
        return this.model;
    }

    public void setModel(String model) { // setter method for Model
        this.model = model;
    }
    
    public void setMileage(double mileage) { // setter method for Mileage
        this.mileage = mileage;
    }
}


public class OOPsExamples {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2021, 200); // instiation

        // Display car information
        myCar.displayCarInfo();

        // Modify the car's mileage
        myCar.setMileage(500);

        // Display updated car information
        System.out.println("\nAfter updating mileage:");
        myCar.displayCarInfo();

        // print model
        System.out.println(myCar.getModel());


        // Mobile object creation
        Mobile realme = new Mobile(); // JVM will provide default no args constructor, if no constructor is defined in the class
        System.out.println(realme.name);
        System.out.println(realme.model);
        System.out.println(realme.price);

        Mobile mi = new Mobile();
        mi.name = "Readme 11"; // initialization using reference variable, it is only posssible when access modifier is nonprivate
        mi.model = "X1242";
        mi.price = 19262.23d;

        System.out.println(mi.name);
        System.out.println(mi.model);
        System.out.println(mi.price);
    }
}
