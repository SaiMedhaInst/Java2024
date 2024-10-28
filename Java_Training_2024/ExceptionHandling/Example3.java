import java.io.FileWriter;
import java.io.IOException;
public class Example3 {
    public static void main(String[] args) {
        
        /* 
        try {
            int a[] = new int[Integer.MAX_VALUE];
            a[4] = 30 / 12;
          } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
          } catch (Exception e) {
            System.out.println("Parent Exception occurs");
          } catch(Error error) {
              System.out.println("handled Error: Error Name: " + error.getClass().getName());
          }
          System.out.println("rest of the code");

        */

    /*    
        try {
            System.out.println("Outer try block");

            try {
                System.out.println("Inner try block");
                int result = 10 / 0;
                System.out.println(result);
            } finally {
                System.out.println("Inner try Finally block");
            }
            
            int[] numbers = new int[5];
            numbers[10] = 25;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer catch block: " 
            + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in inner catch block: " 
            + e.getMessage());
        }

        System.out.println("After the nested try-catch blocks");

    */  

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("example.txt");
            fileWriter.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        } finally {
            // Ensure that the file writer is closed
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Caught an IOException while closing file writer: " + e.getMessage());
                }
            }
        }
        System.out.println("file operation is completed..");

        System.out.println("*******************************");
        System.out.println(testFinally());
    }

    public static int testFinally() {
        try {
            return 1/0;
        } catch(Exception ex) {
            return 3;
        }
        finally {
            int arr[] = new int[5];
            arr[0] = 10;
            return arr[0] + arr[5];
        }
    }
}
