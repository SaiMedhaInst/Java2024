public class Example {

    // static variable
    private final static String collegeName = "SRI INDIU";

    // declare instance variables 
    public String name;
    public float collegeFee;

    public static void main(String[] args) {
        // delcare two local variables 
        int num1 = 100;
        int num2 = 300;
        System.out.println("Addition : "+ (num1 + num2));
        System.out.println("Multiplication: "+ (num1 * num2));

        // Accessing instance variables with object name 
        Example e1 = new Example();
        e1.name = "kumar";
        e1.collegeFee = 182282.272F;

        System.out.println(e1.name);
        System.out.println(e1.collegeFee);

        Example e2 = new Example();
        e2.name = "srikanth";
        e2.collegeFee = 182282.272F;

        System.out.println(e2.name);
        System.out.println(e2.collegeFee);
        
        // Accessing static variable with ClassName 
        System.out.println(Example.collegeName);


        
    }
}
