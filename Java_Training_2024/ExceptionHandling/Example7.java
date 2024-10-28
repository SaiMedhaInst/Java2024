import java.io.FileNotFoundException;
import java.io.IOException;


class Parent{      
    void msg() throws ArithmeticException {  
      System.out.println("Parent msg method with IOException declaration");  
    }    
}    
      
class Child extends Parent{    
    void msg() throws IOException {    
      System.out.println("Child msg method with Arithmetic Exception declaration ");   
    }
}

public class Example7 {
    public static void main(String[] args) {
        
    }
}
