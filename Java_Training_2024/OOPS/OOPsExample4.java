package OOPS;

interface Bank{  
    float rateOfInterest();  
    default void processUpiPayment() {
        System.out.println("processing upi payments");
    }

    public static double interestCalculation(int amt) {
        return amt > 100000 ? 5.6 : 4.2;
    }
}  

class SBI implements Bank{  
    public float rateOfInterest(){
        return 9.15f;
    }

    @Override
    public void processUpiPayment() {
        System.out.println("processing upi payments through SBI");
    }
    
}  
    
class PNB implements Bank{  
    public float rateOfInterest(){
        return 9.7f;
    }  

}  
// Example-2

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs" + amount 
                                + " with card number " + cardNumber);
    }
}

class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Rs" + amount 
                + " with email " + email);
    }
}


// 
interface MathOperations {
	
    static int add(int a, int b) {
        return a + b;
    }

}

//

interface Vehicle {
		
    private void startEngine() { // Private method
        System.out.println("Engine started.");
    }
    
    default void drive() { // Default method
        startEngine(); // Calls the private method
        System.out.println("Vehicle is driving.");
    }
}

class Bike implements Vehicle {
    
}

public class OOPsExample4 {
    public static void main(String[] args) {
        // SBI sbi = new SBI();
        // System.out.println(sbi.rateOfInterest());

        // PNB pnb = new PNB();
        // System.out.println(pnb.rateOfInterest());

        Bank bank = null;
        bank = new SBI(); // parent class reference variables, holding child class object.
        System.out.println(bank.rateOfInterest());
        bank.processUpiPayment();

        bank = new PNB();
        System.out.println(bank.rateOfInterest());

        // 
        System.out.println("********************");
        CreditCard cc = new CreditCard("3380 7012 0722");
        cc.processPayment(1000);

        PayPal payPal = new PayPal("kumarhotfix@yahoo.com");
        payPal.processPayment(2000);

        System.out.println("**************");
        System.out.println(MathOperations.add(10, 22));

        //Bike bike = new Bike(); 
        Vehicle bike = new Bike();
        bike.drive();
    }
}
