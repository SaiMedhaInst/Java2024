public class DataTypeExamples {

    public static void main(String[] args) {
        boolean isEmployee = true; // 1 bit
        byte byteVar = 120; // 1 byte (8bits)
        short shortVar = 6524; // 2bytes
        int intVar = 28926623; // 4 bytes 
        long longVar = 18927290367289L; // 8 bytes
        
        float price = 10.5F; // 4 bytes
        double salary = 10982922.282; // 8 bytes 


        char letter = 'a'; // 2bytes [16bits] [0 - 65535]
        String name = "Kumar Rajamoni"; // class available inside java.lang.String

        System.out.println(isEmployee);
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        
        System.out.println(price);
        System.out.println(salary);

        System.out.println(letter);
        System.out.println(name);

        byte myNum = 127;
        myNum += 1; // myNum = myNum + 1
        System.out.println(myNum);

        int unicodeCharCode = 0x0C05; //hexidecimal unicode value
        System.out.println(unicodeCharCode);

        char telugLetter = 3077; // decimal unicode value
        System.out.println(telugLetter);


        char myVar1 = 65, myVar2 = 66, myVar3 = 97;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        


    


    }
    
}