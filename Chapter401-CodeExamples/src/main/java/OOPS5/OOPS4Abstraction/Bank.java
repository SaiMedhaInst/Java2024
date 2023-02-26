package OOPS5.OOPS4Abstraction;

abstract class Bank {

    public String name;
    Bank(){
        this.name = "Kumar Rajamoni";
        System.out.println("invoked constructor for Abstract class..");
    }
   abstract void display();
    abstract  double rateOfInterest();
}

class SBI extends Bank{

    SBI(){
        System.out.println("SBI constructor.....called....");
    }
    @Override
    void display() {
        System.out.println("display method of SBI class..");
        System.out.println(super.name);
    }

    @Override
    double rateOfInterest() {
        return 8.5;
    }
}

class ICICI extends Bank{

    ICICI(){
        System.out.println("ICICI class constructor...");
    }
    @Override
    void display() {
        System.out.println("display method of ICICI....");
        System.out.println(super.name);
    }

    @Override
    double rateOfInterest() {
        return 8.2;
    }
}

class Driver{
    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println(sbi.rateOfInterest());
        sbi.display();

//        ICICI icici = new ICICI();
//        System.out.println(icici.rateOfInterest());
    }
}

