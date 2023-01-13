package StringPractice;
import java.io.*;
import java.util.*;

public class Methods {
    public static void main(String[] args) {

/*
        String firstName = "SaiMedha";
        String lastName = "ECET Institution";
        System.out.println(firstName + " " + lastName);

        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)
        System.out.println(z);
//If you add a number and a string, the result will be a string concatenation:
        String x1 = "10";
        int y1 = 20;
        String z1 = x1 + y1;  // z will be 1020 (a String)

        System.out.println(z1);
        */

      /*  String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println("".length());
        System.out.println("A".length());
        */

      /*  String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
*/

    /*    String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);
        System.out.println(myStr.charAt(2));*/

     /*   System.out.println("KUmar".isEmpty());
        System.out.println("".isEmpty());
        System.out.println("".isBlank());
*/
    /*    String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("e", 12));*/

//        String txt = "    SaiMedha   ";
//        System.out.println(txt.length());
//        System.out.println(txt);
//        String txt2 = txt.trim();
//        System.out.println(txt2 + " "+ txt2.length());

       /* System.out.println("hello".equals("hello"));
        System.out.println("Hello".equals("Hi"));
        System.out.println("hi".equalsIgnoreCase("HI"));*/

     /*   String myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));*/

/*        boolean b1=true;
        byte b2=11;
        short sh = 12;
        int i = 13;
        long l = 14L;
        float f = 15.5f;
        double d = 16.5d;
        char chr[]={'j','a','v','a'};

        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        String s8 = String.valueOf(chr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);*/


//        String myStr1 = "Hello";
//        String myStr2 = "hello";
//        System.out.println(myStr1.compareTo(myStr2));

    /*    String s1="java is interpreted and robust Language.";
        String[] words=s1.split("\\s");
        System.out.println(words);

        System.out.println(Arrays.toString(words));*/
/*

        String regex = "^J..a$";
        System.out.println("Java".matches(regex));
        System.out.println("Kumarrajamoni".matches("[A-Za-z]*"));
*/

        // a search pattern for only numbers
      /*
        String regex1 = "^[0-9]+$";
        System.out.println("123a".matches(regex1)); // false
        System.out.println("98416".matches(regex1)); // true
        System.out.println("98 41".matches(regex1)); // false
*/
        System.out.println("KUMaR".matches("[A-Z]+"));



    }
}
