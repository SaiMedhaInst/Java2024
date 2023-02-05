import java.util.Scanner;

/* 

A year is a leap year if the following conditions are satisfied: 

The year is multiple of 400.
The year is multiple of 4 and not multiple of 100.

*/

public class LeapYear {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter YEAR: ");
    long year = in.nextLong();

  //   if(year%400 == 0){
  //     System.out.printf("%d is a leap year.", year);
  //   }
  //   else if(year%100 == 0){
  //     System.out.printf("%d is not a leap year.", year);
  //   }
  //   else if(year%4 == 0){
  //     System.out.printf("%d is a leap year.", year);
  //   }
  //   else {
  //     System.out.printf("%d is not a leap year.", year);
  //  }

   if((year%400 ==0) || (year%100!=0 && year%4==0)){
    System.out.println("leap year");
   }
   else{
    System.out.println("not leap year");
   }


   in.close();

  }
  
}
