import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        // Strings

        // using Literals : STRING CONSTANT POOL
        String s1 = "Hello, World";
        String s2 = "Jai Balayya";
        String s3 = "Hello, World";

        // new operator : HEAP MEMORY
        String s4 = new String("Hello, Java");
        String s5 = new String("Helllo, Python");
        String s6 = new String("hello, java");

        // == will always compares address of reference variables 
        System.out.println("*** == ***");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);

        // equals or equalsIgnoreCase to compare content 
        System.out.println("*** equals ***");
        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));

        System.out.println("***** equalsIgnoreCase ***");
        System.out.println(s4.equalsIgnoreCase(s6));

        // methods 
        System.out.println("********* STRING METHODS ********");
        String s = "Hello, Java!";
        
        // length() 
        System.out.println(s.length());
        
        // charAt(int index) -- character
        System.out.println(s.charAt(8));

        // indexOf(String substring) -- index 
        System.out.println(s.indexOf(","));
        System.out.println(s.indexOf("Java"));


        // replace 
        System.out.println(s.replace("Java", "Python"));

        // substring(starIndex, endIndex)
        System.out.println(s.substring(5, 10));

        // toUpperCase() and toLowerCase()
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // trim() : remove leading and tailing whitespaces
        s = "      Hello  World  ";
        System.out.println("Length Before Trim" + s.length());
        s = s.trim();
        System.out.println("Length After Trim" + s.length());

        // valueOf
        int number = 123;
        boolean boolValue = true;
        char singleChar = 'A';
        char[] charArray = {'J', 'a', 'v', 'a'};

        System.out.println(String.valueOf(singleChar));
        System.out.println(String.valueOf(number));
        System.out.println(String.valueOf(boolValue));
        System.out.println(String.valueOf(charArray));

        // split() : split the string based on delimiter 
        s = "Hello Hi Bye Java";
        String[] res = s.split(" ");
        System.out.println(Arrays.toString(res));

        // getBytes()
        byte res1[] = s.getBytes();
        System.out.println(Arrays.toString(res1));

        // bytes[] to string 
        byte[] data = {72, 101, 108, 108, 111, 32, 72, 105, 32, 66, 121, 101, 32, 74, 97, 118, 97};
        String res3 = new String(data);
        System.out.println(res3);
    }
}
