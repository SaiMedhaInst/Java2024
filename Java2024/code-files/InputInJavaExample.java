import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputInJavaExample {
    public static void main(String[] args) throws IOException {

    
        //readInputUsingScanner();
        // readInputUsingBufferedReader();
        readInputsByCommadnLineArgs(args);

    }

    public static void readInputUsingScanner() {
                // create object for scanner class 
                Scanner in = new Scanner(System.in);

                System.out.println("Enter name, age and salary:");
        
                int a = 100; // static declaration
                // String input
                String name = in.nextLine(); // dynamic declaration
        
                // Numerical input
                int age = in.nextInt();
                double salary = in.nextDouble();
        
                float price = in.nextFloat();
                boolean isEmployee = in.nextBoolean();
                short distance = in.nextShort();
                byte duration = in.nextByte();
                long distanceToMoon = in.nextLong();
                char grade = in.next().charAt(0); // reading charater
        
        
                // Output input by user
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Salary: " + salary);
                System.out.println("price: " + price);
                System.out.println("isEmplyee: "+ isEmployee);
                System.out.println("distance: "+ distance);
                System.out.println("duration: "+ duration);
                System.out.println("distance to moon: "+ distanceToMoon);
                System.out.println("grade: "+ grade);
        
    }


    public static void readInputUsingBufferedReader() throws IOException {

            BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter name,age,salary,grade,isEmpolyee : ");

            // String reading internally
            String name = bfn.readLine();

            // Integer reading internally
            int age = Integer.parseInt(bfn.readLine()); // string - int

            //Double
            double salary = Double.parseDouble(bfn.readLine());

            //grade
            char grade = bfn.readLine().charAt(0);

            //boolean
            boolean isEmployee = Boolean.parseBoolean(bfn.readLine());



            // Printing String
            System.out.println("name : " + name);

            // Printing Integer
            System.out.println("age : " + age);

            System.out.println("salary : " + salary);

            System.out.println("grade : " + grade);

            System.out.println("isEmployee : " + isEmployee);

            


            // Wrapper classes
            // int - Integer
            // float - Float
            // double - Double
            // long - Long 
            // short - Short
            // boolean - Boolean
            // byte - Byte
            // char -Character 



    }

    public static void readInputsByCommadnLineArgs(String[] args) {

        String name = args[0];

        int age = Integer.parseInt(args[1]);

        double salary = Double.parseDouble(args[2]);

        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("salary: "+ salary);
    }
}
