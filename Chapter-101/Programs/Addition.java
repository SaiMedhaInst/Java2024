import java.io.*;

class A{}

class B{
		public static void main(){
			System.out.println("B class Main Method");
}
}

class C{}

public class Addition{
	public static void main(String[] args){
		int a = 23;
		int b = 2;
		
		System.out.println("Addition is :"+(a + b));
		
		System.out.println("Subtraction is :"+(a - b));
		
		System.out.println("Multiplication is :"+(a * b));
		
		System.out.println("Division is :"+(a / b));
		
		B.main();
	}
}