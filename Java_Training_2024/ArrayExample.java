import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Arrays;

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

        System.out.println("***** ND Arrays *******");

        // ND arrays 
        int[][] matrix = new int[3][4];
        int [][]matrix1 = new int[3][4];
        int matrix2[][] = new int[3][4];
        int []matrix3[] = new int[3][4];
        int[][] matrix4 = new int[3][]; // Jagged array 

        // Invalid 
        // rowSize is mandatory, columnSize is optional 
        // int[][] matrix5 = new int[][4];

        // using Literal
        int[][] mat = { {1, 2, 3}, {4, 5, 6}, {7, 8} , {11, 12, 13, 14, 15}};
        System.out.println(mat.length); // num of rows
        System.out.println(mat[3].length); // nums of columns
        System.out.println(mat[3][2]);

        // Jagged Arrays 
        int arr[][] = new int[3][];  
		arr[0] = new int[3];  
		arr[1] = new int[4];  
		arr[2] = new int[2]; 



        // check Arrays are passed by value or reference 
        float salaries[] = {10.5f, 12.4f, 15.3f, 7.7f};
        testArray(salaries);
        System.out.println(Arrays.toString(salaries)); // print the array in a single line


        // 1D array cloning : deep copy
        float cloneSalaries[] = salaries.clone();

        salaries[1] = 30.5f; 

        System.out.println("1D Original Array " + Arrays.toString(salaries));
        System.out.println("1D Clonned Array " + Arrays.toString(cloneSalaries));

        // ND cloning : swallow copy
        int[][] matClone = mat.clone();
        mat[0][0] = 1729;
        System.out.println("ND Original Array " + Arrays.toString(mat[0]));
        System.out.println("ND Clonned Array " + Arrays.toString(matClone[0]));
    
    }

    public static void testArray(float arr[]) {
        arr[0] = 20.5f;
        System.out.println(Arrays.toString(arr));
    }
}
