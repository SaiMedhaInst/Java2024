import java.io.IOException;

public class Example5 {
    public static void main(String args[]) throws InvalidAgeException {
        // validate(17);
        // System.out.println("rest of the code...");

        Example5 obj = new Example5();
        obj.p();
        System.out.println("normal flow...");
    }

    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

          
    public void p() {
        try {
          n();
        } catch (Exception e) {
          System.out.println("exception handled: " + e.getMessage());
        }
    }

    public void n() throws IOException{
        m();
    }

    public void m() throws IOException {
        int data = 50 / 2;
        throw new IOException("Sorry IO exception occurred.");
      }
      


      
}
