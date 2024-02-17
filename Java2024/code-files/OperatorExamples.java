import java.util.HashMap;
import java.util.Scanner;

public class OperatorExamples {
    public static void main(String[] args) {

        //arithmeticOperations(args); // method calling
        //relationOperations();
        //logicalOperators();
        //realTimeExample();

        //arithmeticExample();

        bitwiseOperations();

        // ternaryOperations();


    }

    public static void arithmeticOperations(String[] args) {
        // String addition : "10" + "20" --> "1020"
        // Integer addition : 10 + 20 --> 30

        // num1 
        int n1 = Integer.parseInt(args[0]);  // "10" --> 10

        // num2
        int n2 = Integer.parseInt(args[1]);

        int addition = n1 + n2;
        int difference = n1 - n2;
        int mul = n1 * n2;
        int division = n1 / n2;
        int remainder = n1 % n2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + division);
        System.out.println("Modulus | Remainder: " + remainder);

     /*    
        // Increment 
        n1+= 10; // n1 = n1 + 10
        System.out.println("n1 : "+ n1);

        n1-=5; // n1 = n1 - 5
        System.out.println("n1 : "+n1);

        ++n1; // pre increment
        System.out.println("n1: "+ n1);
        
        n2++; // post increment
        System.out.println("n2: "+ n2);
    */
        // operation
        int result1 = ++n1 + n2++;
        System.out.println("result : "+ result1);

        //Decrement 
        int result2 = n1-- + --n2 + --n1;
        System.out.println("result2 : " + result2);

        // pre: first do the operation(+,-), then evaluate
        // post: take current value for evaluation, later do the operation (+, -)
    }

    public static void relationOperations() {
        // create object scanner
        // System.in --> InputStream
        // System.out  --> outstream
        Scanner scan = new Scanner(System.in);

        int a = 10; //static declaration
        System.out.println("enter values for b: ");
        int b = scan.nextInt(); // dynamic declaration


        // relational operators --> true | false
        System.out.println("a > b " + (a > b));
        System.out.println("a < b "+ (a < b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("a >= b " + (a >= b));
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
    
    }

    public static void logicalOperators() {

        // logical operators result will be always boolean , true | false
        String name = "Kumar";
        String password = "kumar321";

        boolean logicalAnd = name == "Kumar" && password == "kumar321"; // both conditions must be true
        System.out.println("logicalAnd : "+ logicalAnd);

        boolean logicalOr = name == "prakash" || password == "kumar321"; // atleast one condition should be true
        System.out.println("logicalOr : "+ logicalOr);

        boolean logicalNot = !(name == "Kumar" && password == "kumar321"); // reverse the result
        System.out.println("logicalNot : "+ logicalNot);


        int a = 10;
        int b = 20;
        int c = 20;

        boolean result1 = (a < b) && (b == c);
        System.out.println("result1 : " + result1);

        // short circuit AND 
        // In logical AND, if first condition is false, it will not second condition
        boolean result2 = (a > c) && (++b > c); 
        System.out.println("result2 : "+ result2);
        
        System.out.printf("b = %d\n",b);


        // short circuit OR 
        // in logical OR, if first condition is TRUE, ignore second condition 
        boolean result3 = (b > 40) || (++b > c); 
        System.out.println("result3 : "+ result3);
        System.out.printf("b = %d\n",b);



    }

    public static void realTimeExample() {
        // stores user creds
        HashMap<String, String> database = new HashMap<>();
        database.put("kumar", "kumar321");
        database.put("ram", "ram321");
        database.put("srikanth", "srikanth321");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username and Password: ");

        String inputUsername = scan.nextLine();
        String inputPassword = scan.nextLine();

        //System.out.println(inputPassword + " " + inputUsername);

        if (database.containsKey(inputUsername) && inputPassword.equals(database.get(inputUsername))) {
            System.out.println("LOGIN SUCCESS");
        } else {
            System.out.println("Invalid Creds");
        }
    }

    public static void arithmeticExample () {
        float result = 10 + 20.5f; // int + float --> float
        System.out.println(result);

        double result2 = 4 + 5.5; // int + double ---> double 
        System.out.println(result2);

        double result3 = 7.2f + 8.8; // float + double ---> double
        System.out.println(result3);

        int result4 = 10 / 3; // int / int ---> int
        System.out.println(result4);

        float result5 = 10 / 3f; // int / float ---> float
        System.out.println(result5);

        double result6 = 5.0/2; // int / double ---> double or double / int ---> double
        System.out.println(result6);

        // modulus 
        // int % float ---> ?
        // int % double ---?
        // float % float --?
        // double % double ---? 
        

    }

    public static void bitwiseOperations() {
        // result will be integer 

        char a = 'A';
        char b = 'a';

        // AE
        //System.out.println(10 / 0);


        // bitwise AND : & 
        System.out.println(a & b);

        // bitwise OR: | 
        System.out.println(a | b);

        // bitwise EX-OR : ^ 
        System.out.println(a ^ b);


        // left shift : << 
        System.out.println(2 << 2); // n * 2^bits
        

        // right shift : >> 
        System.out.println( 40 >> 4); // n / 2^bits


    }


    public static void ternaryOperations() {
        // result = exp1 ? exp2 : exp3

        int a = 1;
        int b = 5;

        int result1 = (a>b) ? (b>=5 ? ++b : --a) : (++a + b++);

        System.out.println(result1);

        char grade = 'A';
        int totalMarks = 66;

        String result2 = totalMarks >= 90 && grade == 'A' ? "First Class Pass" : "Second Class Pass";
        System.out.println(result2);


        int age = 16;
        boolean isEligibleToCastVote = age >= 18 ? true : false;
        System.out.println(isEligibleToCastVote);

        int num = 17;
        boolean isEven = num%2 ==0 ? true : false;
        System.out.println(isEven);

        boolean isOdd = num%2!=0? true : false;
        System.out.println(isOdd);


    }
}
