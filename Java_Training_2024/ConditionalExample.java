public class ConditionalExample {

    
    public static boolean isEven(int num){
        return num%2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        
        // different ways of conditions
        if(true){
            System.out.println("true block...");
        }
        
        int x = 20;
        int y = 18;
        if (x > y) {
          System.out.println("x is greater than y");
        }
        
                
        if('a'>'A'){
            System.out.println("greater..");
        }

        int age = 16;
        
        if((age>0) && (age%2==0)){
            System.out.println("Even age number");
        }

        
        if(isEven(10)){
            System.out.println("Even Number.");
        }

        // invalid ways of conditions
    /*     
        int age1 = 10;
        if(age1){
            System.out.println("true block and age positive");
        }

        if(age && 2){
            System.out.println("applying bitwise and on age variable.");
       }
    */

        // if else 
        System.out.println("**** if else ***");
        int number = 21;
        if (number%2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }

        // else if 
        int marks = 85;
        if (marks > 90) {
            System.out.println("A+");
        } else if (marks>80) {
            System.out.println("A");
        } else if (marks>70) {
            System.out.println("B");
        } else if (marks>60) {
            System.out.println("C");
        } else if (marks>=50 && marks<60) {
            System.out.println("D");
        } else if (marks>40) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail :(");
        }

        // mutiple ifs 
        int num = -9;
        if(num%2==1)
            System.out.println("odd");
        if(num%2==0)
            System.out.println("even");
        if(num>=0)
            System.out.println("postive number");
        else
            System.out.println("not postive number...");

        // switch 
        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            //break;
        case 5:
            System.out.println("Friday");
            //break;
        case 6:
            System.out.println("Saturday");
            //break;
        case 7:
            System.out.println("Sunday");
            //break;
        default:
            System.out.println("Invalid day number");
        }

        // nested if 
        System.out.println("**** NESTED EXAMPLE ");
        int n = 3;
        if(n > 0){
            System.out.println("at Level-1 value is: "+ n);
            n -= 1;
            if(n > 0){
                n -= 1;
                System.out.println("at Level-2 value is: " + n);
                if(n > 0){
                    System.out.println("at Level-3 value is: " + n);
                }
            }
        }

        // nested if else 
        int a=10,b=25,c=20;
        if(a>b){
            if(a>c){
                System.out.println(a+ " is greater");
            }else{
                System.out.println(c+ " is greater");
            }
        }else{
            if(b>c){
                System.out.println(b+ " is greater");
            }else{
                System.out.println(c+ " is greater");
            }
        }

        // using logical operators 
        if (a > b && a > c) 
            System.out.println(a + " is greater");
        else if (b > a && b > c) 
            System.out.println(b + " is greater");
        else 
            System.out.println(c + " is greater");

        // nested switch
        int year = 3;
        marks = 80;
        switch(year) //Switch expression
        {
            //Case statements
            case 1: System.out.println("First year students");
                break;
            case 2: System.out.println("Second year students");
                break;
            case 3: switch(marks) {
                        case 50: System.out.println("You are not eligible for scholarship");
                            break;
                        case 80: System.out.println("Congrats!!!!! you are eligible for scholarship");
                            break;
                    }
                break;
            //Default case statement
            default: System.out.println("Please enter valid year");
        }

        // switch with ENUM (group of constants)\
        Color color = Color.GREEN;
        switch (color) {
            case RED:
                System.out.println("Color is Red");
                break;
            case GREEN:
                System.out.println("Color is Green");
                break;
            case BLUE:
                System.out.println("Color is Blue");
                break;
            
        }

    }
    
}


enum Color { RED, GREEN, BLUE }