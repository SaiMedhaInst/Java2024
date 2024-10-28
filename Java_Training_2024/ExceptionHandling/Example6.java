import java.io.IOException;
import java.io.FileNotFoundException;

class Test {
    void m1() throws IOException {
        System.out.println("inside m1 () method");
    }
    void m2() throws FileNotFoundException {
        System.out.println("inside m2() method");
        throw new FileNotFoundException("Can't find the file");
    }
}

public class Example6 {
    public static void main(String args[]) throws FileNotFoundException {
        Test t = new Test();
        try {
            t.m1();
        } catch(IOException ex) {
            System.out.println("IOException Handled..");
        }

        try {
            t.m2();
        } catch(FileNotFoundException ex) {
            //throw new FileNotFoundException("can't access the file");
        }


        Test obj = new Test();
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        
        System.gc();
        System.out.println("End of the garbage collection");

        System.out.println("end of the program");
    }

    protected void finalize() {
        System.out.println("Called the finalize() method");
    }
}
