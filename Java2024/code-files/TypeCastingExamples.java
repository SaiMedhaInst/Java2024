public class TypeCastingExamples {
    public static void main(String[] args) {

        // Widening |  implicit type casting [done by java ] | smaller - big
        byte byteVar = 100;
        int intVar = byteVar; // byte[1] --> int[4]

        long longVar = intVar; // int[4] --> long [8]
        long longVar2 = byteVar; // byte --> long 

        // Narrowing  | explicit type casting [done by programmer] | big - smaller
        double doubelVar = 97.17; // 8bytes
        char charVar = (char)doubelVar; // 2bytes
        System.out.println(charVar);


        //  Examples
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        
        //Narrowing Casting
        
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        float salary = 9700.263F;
        short myShort = (short) salary;
        System.out.println(myShort);


        boolean boolVar = true; //1 bit
        int myInt2 = boolVar; // 1 byte
        System.out.println(myInt2);

    }
}