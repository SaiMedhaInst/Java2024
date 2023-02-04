package methods;

import java.util.Arrays;

public class Test {
    public void greet(String name) {//instance
        System.out.println("Hey Hi Welcome ," + name);
    }

    public char returnFirstCharater(String name){
        return name.charAt(0);
    }

    public static int sumOfArray(int[] arr){
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s = s+arr[i];
        }
        return s;
    }

    public static int[] changeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]+10;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("hey am main method of Test Class");

        //creation
       /* Test t = new Test();
        t.greet("Kumar");
        t.greet("Saimedha");
        char r = t.returnFirstCharater("ECET");
        System.out.println(r);*/

        int ret = sumOfArray(new int[]{10,20,30,30});
        System.out.println(ret);

        int retarr[] = changeArray(new int[]{1,2,3});

        for(int data: retarr) System.out.print(data+" ");

        System.out.println(Arrays.toString(retarr));


    }
}
