package OOPS4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A {
     static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        //shallow copy

        int[][] arr={{10,20,30},{11,22,33}};

        int arr2[][] = arr.clone();

        arr[1][0]=222;

        System.out.println(arr);
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr2[1]));

        int arr3[] = {100,200};
        int arr4[] = arr3.clone(); //deep copy

        arr3[0] = 3096;
        System.out.println(Arrays.toString(arr3) +" "+ Arrays.toString(arr4));

        int arr5[][] = new int[3][];
        arr5[0] = new int[5];
        arr5[1] = new int[2];

//        int arr6[] = new int[Integer.MAX_VALUE-10];
//        System.out.println(Arrays.toString(arr6));
        int a1 = 10;
        int b1 = 10;
        Integer a = 10;
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a1) + " "+ System.identityHashCode(b1));





    }
}
