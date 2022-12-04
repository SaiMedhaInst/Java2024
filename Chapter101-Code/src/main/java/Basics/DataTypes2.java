package Basics;

public class DataTypes2 {
    static String subjectName;
    public static void main(String[] args) {
        byte myNum = 100;
        System.out.println(myNum);

        short myNum1 = 5000;
        System.out.println(myNum1);

        int myNum2 = 100000;
        System.out.println(myNum2);

        long myNum3 = 15000000000L;
        System.out.println(myNum3);

        float myNum4 = 5.75f;
        System.out.println(myNum4);

        double myNum5 = 19.99d;
        System.out.println(myNum5);

        float f1 = 35e3f;
        double d1 = 12E4d; //e" to indicate the power of 10:
        System.out.println(f1);
        System.out.println(d1);

        boolean isStudent = true;
        boolean isPrime = false;
        System.out.println(isStudent);     // Outputs true
        System.out.println(isPrime);

//Java has a boolean data type, which can only take the values true or false:

//chars

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

//STRINGS

        String greeting = "Hello World";
        System.out.println(greeting);

        // non primitive


        System.out.println(subjectName);
    }
}

