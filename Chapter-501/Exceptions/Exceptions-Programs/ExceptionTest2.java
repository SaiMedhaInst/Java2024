import java.io.FileNotFoundException;
import java.io.IOError;

class Parent{    
  void msg() throws IOError {  
    System.out.println("parent method");  
    }    
}

    
class Child extends Parent{    

  void msg() throws Exception{    
    System.out.println("TestExceptionChild");    
  }

}


public class ExceptionTest2 {
  public static void main(String[] args) {
    


    
  }
}
