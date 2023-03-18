import java.io.IOException;

public class ExceptionTest {

  void m1()throws IOException{  
    System.out.println("am inside m1 method");
    throw new IOException(); 
   }

   public static int divideNum(int m, int n) throws IOException {  
    int div = m / n;  
    System.out.println(div);
    throw new IOException("throwing ArithmeticException"); 
   
}
  public static void main(String[] args) {
    
    ExceptionTest et = new ExceptionTest();
    
    // et.m1();
    try{divideNum(100, 20);}

    catch(Exception e){System.out.println(e);}
  }
  
}
