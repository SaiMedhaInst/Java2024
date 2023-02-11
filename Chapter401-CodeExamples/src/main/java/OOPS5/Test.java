package OOPS5;
import OOPS4.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        int userInp;
        int randomNumber = (int) (Math.random()*100);
        do{
            System.out.println("Enter the number to guess: ");
            userInp = scan.nextInt();

            if (userInp>=0){
                if(userInp == randomNumber){
                    System.out.println("correct guess");
                    break;
                }
                System.out.println("wrong guess "+ randomNumber);

            }
        }while(userInp>0);*/

        for(int data: new int[] {10,20,30,40}){
            System.out.println(data);
            if(data == 30){
                break;
            }
        }

        for(char ch:"Kumar".toCharArray()){
            System.out.println(ch +" ");
        }
    }
}
