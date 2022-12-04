package Operators;

public class logical {
    public static void main(String[] args) {

        int age = 20;
        float salary = 1092.289f;
        String name = "Kumar";

//         && || !  ==> true or false

        boolean result = (age>0) && (age<50);
        System.out.println(result);

        boolean result1 = (age>0) || (age<15);
        System.out.println(result1);

        boolean result3 = !((age>0) && (age<50));
        System.out.println(result3);

        boolean result4 = (age>15) && name.equals("John");
        System.out.println(result4);





    }
}
