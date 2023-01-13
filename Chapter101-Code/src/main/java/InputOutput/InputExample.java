package InputOutput;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
/*

        System.out.println("Enter name age ");

        String name = obj.nextLine();

        int age = obj.nextInt();

        System.out.println("name : "+name +" "+" age : "+age);
*/

        System.out.println("Enter the num1 & num2 : ");
        int num1 =  obj.nextInt();
        float num2 = obj.nextFloat();

        float addition = num1 + num2 ;
        System.out.printf("Addition is %.2f " , addition);
    }
}
