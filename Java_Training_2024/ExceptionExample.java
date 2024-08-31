public class ExceptionExample {

  public static void main(String[] args) {
    try {
      System.out.println("Outer try block");

      try {
        System.out.println("Inner try block");
        int result = 10 / 0;
        System.out.println(result);
  
      } finally {
        System.out.println("inner finally block");
      }
      
      int[] numbers = new int[5];
      numbers[10] = 25;

    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException in outer catch block: " 
      + e.getMessage());
    }

    System.out.println("After the nested try-catch blocks");
  }
}
