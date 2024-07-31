public class DataTypeExamples {
    public static void main(String[] args) {
        byte byteNum = 100;
        System.out.println(byteNum);

        short shortNum = 5000;
        System.out.println(shortNum);

        int intNum = 100000;
        System.out.println(intNum);

        long longNum = 15000000000L;
        System.out.println(longNum);

        float floatNum = 5.75f;
        System.out.println(floatNum);

        double doubleNum = 19.99d;
        System.out.println(doubleNum);

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

        char charVar1 = 65, charVar2 = 66, charVar3 = 67;
        System.out.println(charVar1);
        System.out.println(charVar2);
        System.out.println(charVar3);

        //STRINGS
        String greeting = "Hello World";
        System.out.println(greeting);

        // Array 
        int[] marks = new int[10];


    }
}
