package arrays;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {

        String arr[]={"Tata","MG","Swift"};
        System.out.println("Printing original array:");

        for(String i:arr)
            System.out.println(i);

        System.out.println("Printing clone of the array:");
        String[] cars =arr.clone();
        for(String i:cars)
            System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr==cars);

        arr[2] = "Maruti";
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(cars));
    }
}
