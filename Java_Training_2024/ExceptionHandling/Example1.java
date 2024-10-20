import java.io.FileOutputStream;
import java.io.IOException;
public class Example1 {
    public static void main(String[] args) {
        /*
		System.out.println(Integer.MAX_VALUE);
        int arr[] = new int[Integer.MAX_VALUE];
        System.out.println(arr[0]);
		*/
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		fos.write("Hello World Java".getBytes());
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("Addition " + (num1 + num2));
		System.out.println("Division " + (num1 / (num2 - (num1 + num1))));
		System.out.println("Multiplication " + (num1 * num2));

        
    }
}