import java.util.Scanner; 

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        try {
            checkValidAge(age);
        } catch(InvalidAgeException ex){
            System.out.println("Exception Handled. Message: " + ex.getMessage());
        }
        System.out.println("program completed...");
    }
    public static void checkValidAge(int age) throws InvalidAgeException {
        if (age<=0) {
            throw new InvalidAgeException("age is invalid, please check");
        } else {
            System.out.println(age + " is valid age");
        }
    }
}
