import java.io.IOException;


public class ExceptionTest {

  public static void main(String[] args) {
    
    ExceptionTest obj = new ExceptionTest();        
    System.out.println("Hashcode is: " + obj.hashCode());           
    obj = null;    
    // calling the garbage collector using gc()   
    System.gc();     
    System.out.println("End of the garbage collection");     

  }
  protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }


}


