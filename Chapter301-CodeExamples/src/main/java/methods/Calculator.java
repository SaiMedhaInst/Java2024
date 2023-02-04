package methods;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mult(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static float add(float a, float b){//over-loading
        return a+b;
    }



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("1.Addition\n2.Subtraction\n3.Multiplictaion\n4.Division\n-1.Exit\n");
            System.out.print("Enter choice:\n");
            int ch = s.nextInt();
            if(ch==1)
                System.out.println("addition is "+add(10,20.3f));
            else if (ch==2)
                System.out.println("subtration is "+sub(20,2));
            else if(ch==3)
                System.out.println("multiplication is "+mult(2,2));
            else if(ch==4)
                System.out.println("division is "+div(10,2));
            else if(ch==-1)
                break;
            else
                System.out.println("provid valid input");
        }
    }
}
