import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayExample {
    public static void main(String[] args) {
        // Valid declaration 
        /* 
        int[] nums1 = new int[10];
        int []nums2 = new int[10];
        int nums3[] = new int[10];
        int nums4[] = {10,20,30,40}; // Array Literals 
        int nums5[] = new int[] {100,200,300}; 
        */

        // Invalid 
        // float floatArr[10] = new float[10]; 
        // byte byteArr[] = new byte[10] {9,8,7,6};

        // Syntax-1 
        int[] numbers = new int[] {10,20,30,40,50};

        // Syntax-2
        int[] numbers2 = {1, 2, 3, 4, 5}; // Array Literals

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};


        // Accessing Element 
        System.out.println(numbers.length); // prints nums of elements
        System.out.println(numbers[2]); // 30
        System.out.println(numbers[numbers.length-1]); // Last Element

        // System.out.println(numbers[numbers.length -1 + 1]); // AIOBE 

        System.out.println(cars[2]);
        System.out.println(cars[cars.length - 1]);
        System.out.println(cars[0] + " " + cars[1]);


        // problem: 
        // declare arrays of student ages 
        // sort the data in asc and desc order

        Integer[] studentAges = {21,19,18,25,27,17,16}; // Wrapper Class arrays

        // method-1 : using array we can sort by apply any sorting algo (manually), it will take 10-15 lines of code

        // method-2: using sort inbuild method of List
        List<Integer> ageList = Arrays.asList(studentAges);
        System.out.println(ageList);
        

        // ascending order 
        ageList.sort(Comparator.naturalOrder());
        System.out.println(ageList);

        // descending order
        ageList.sort(Comparator.reverseOrder());
        System.out.println(ageList);

    
    }
}
