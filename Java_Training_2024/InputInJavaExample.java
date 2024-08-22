import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputInJavaExample {
    public static void main(String[] args)  throws IOException {

        // Command Line Arguments 
        //inputUsingCommandLineArgs(args);

        // using scanner class 
        //inputUsingScannerClass();

        
        // using BufferReader
        inputUsingBufferedReaderClass();

        
    }

    private static void inputUsingBufferedReaderClass() throws IOException {
    
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        // String reading internally
        String str = bfn.readLine();

        int it = Integer.parseInt(bfn.readLine());
        
        float ft = Float.parseFloat(bfn.readLine());
        
        double salary = Double.parseDouble(bfn.readLine());

        int res = bfn.read();
        
        // Printing String
        System.out.println("Entered String : " + str);

        // Printing Integer
        System.out.println("Entered Integer : " + it);

        // Printing Float
        System.out.println("Entered Float : " + ft);

        // Printing Double 
        System.out.println("Entered Double : " + salary);

        // Printing read() method var 
        System.out.println(res);

    }

    private static void inputUsingCommandLineArgs(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0] + args[1] + args[2]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]));

    }

    private static void inputUsingScannerClass() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter College Name: ");
        
        // String without whitespace
        String collegeName = scan.next();
        scan.nextLine(); // to read that line completely

     

        // String with whitespace
        System.out.println("Enter Student Name: ");
        String name = scan.nextLine();

     
        // byte 
        System.out.println("Enter Semester No: ");
        byte semesterNumber = scan.nextByte();

   
        // int 
        System.out.println("Enter Student Age: ");
        int age = scan.nextInt();

        // long 
        System.out.println("Enter Roll Num: ");
        long rollNum = scan.nextLong();

        // boolean 
        System.out.println("Are you student? ");
        boolean isStudent = scan.nextBoolean();

        // double
        System.out.println("Enter Fee: ");
        double fee = scan.nextDouble();

        // char 
        System.out.println("Enter Grade: ");
        char grade = scan.next().charAt(0);

        System.out.println("CollegeName: " + collegeName);
        System.out.println("StudentName: " + name);
        System.out.println("Semester: " + semesterNumber);
        System.out.println("age: " + age);
        System.out.println("roll number: " + rollNum);
        System.out.println("isStudent: " + isStudent);
        System.out.println("fee: " + fee);
        System.out.println("grade: " + grade);
    }
}
