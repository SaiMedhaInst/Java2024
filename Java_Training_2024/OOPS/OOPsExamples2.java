package OOPS;

class Student {
    private static String collegeName;
    private String name;
    private long rollNumber;
    private String section;
    String departmentName;

    // static block
    static { 
        System.out.println("am static block...");
        collegeName = "JNTUH";
    }

    public Student() {
        System.out.println("am constructor...");
        this.name = "Ram Krishna";
        this.rollNumber = 1011362522;
        this.section = "IIYear-A";
        this.departmentName = "CSE-A";
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public String getName() {
        return name;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public String getSection() {
        return section;
    }
}


// Standard 
class ConcreteClass {
    public void display() {
        System.out.println("This is a concrete class.");
    }
}

abstract class Bank {
    public abstract double rateOfInterest(); // can only be defined only inside abstract class
    public String operation() {  // non abstract method
        return "Offers both saving and current account operations";
    }
}

class SBI extends Bank {
    public double rateOfInterest() {
        return 9.2;
    }
}

class HDFC extends Bank {
    public double rateOfInterest() {
        return 8.65;
    }

    public String operation() { // overriding
        return "Offers only saving account";
    }
}


interface MobileI {
    // constants : public static final 
    String YEAR = "2024";
    
    // method signatures or abstract methods: public abstract
    double price();
    String model();
    String manufacturer();
}

class SamSung implements MobileI {

    @Override
    public double price() {
        return 100022.23;
    }

    @Override
    public String model() {
        return "A-1";
    }

    @Override
    public String manufacturer() {
        return "samsung";
    }

}


public class OOPsExamples2 {
    public static void main(String[] args) {
        // regular way of creating object
        Student s1 = new Student();
        System.out.println(s1.getName()); // instance variable
        System.out.println(Student.getCollegeName()); // static variable

        // Anonymous object
        System.out.println(new Student().getRollNumber());
        System.out.println(new Student().departmentName);

        // Standard class or ConcreteClass
        ConcreteClass cc = new ConcreteClass();
        cc.display();


        // Abstract class 
        // Bank sbi = new Bank(); // cannot be instantiated

        Bank sbi = new SBI(); // object of child class storing parent class reference variable.
        Bank hdfc = new HDFC();
        System.out.println(sbi.rateOfInterest());
        System.out.println(hdfc.rateOfInterest());

        System.out.println(sbi.operation());
        System.out.println(hdfc.operation());

        // Interface 
        MobileI sam = new SamSung(); // object of child class storing in interface reference variable.
        System.out.println(MobileI.YEAR);
        System.out.println(sam.model());



    }
}
