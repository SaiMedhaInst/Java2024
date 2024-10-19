package FilesIO;

import java.util.ArrayList;

public class UtilsPackageExamples {
    public static void main(String[] args) {
        // primitive 
        int num = 10;
        System.out.println(num);

        // Wrapper classes 
        Integer num2 = 10;
        Integer rollNum = Integer.parseInt("1130961226");
        System.out.println(rollNum);

        // int - Integer, 
        // short - Short
        // byte - Byte
        // long - Long 
        // float - Float 
        // double - Double 
        // boolean - Boolean 
        // char - Character 

        int primitiveInt = 10; // Primitive type
        Integer wrapperInt = primitiveInt; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperInt);

        Integer wrapperInt2 = 20; // Wrapper class object
        int primitiveInt2 = wrapperInt2; // Autounboxing

        System.out.println("Primitive int: " + primitiveInt2);

        System.out.println("************************");
        // list of nums 
        int[] nums = new int[] {1,12,3,4,15,6};
        //nums.sort(); // No sort method.
        System.out.println(nums);
        
        ArrayList<Integer> arrList = new ArrayList<>();  // <> Generic in java
        arrList.add(1);
        arrList.add(12);
        arrList.add(3);
        System.out.println(arrList);
        arrList.sort(null); 
        System.out.println(arrList);

        // HashSet : will not store duplicates 

        // HashMap: stores data in key:value
    }
}