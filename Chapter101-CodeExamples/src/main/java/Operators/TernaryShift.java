package Operators;

public class TernaryShift {
    public static void main(String[] args) {
        // &
        int a = 5;
        int b = 7;
        System.out.println(a & b); // Bitwise AND

        System.out.println(a | b); // Bitwise OR

        System.out.println(a ^ b); // Bitwise EX-OR

        System.out.println(~a); // bitwise NOT

        // left shift
        int x = -8;
        System.out.println(x << 2);
        // right shift

        System.out.println(x >> 2);

        //unsigned right sift op (always fill with 0's on trailing spaces)

     /*   System.out.println(8 >>> 2);
        System.out.println(-8 >>> 2);*/

     /*   int a1 = -8;
        System.out.println(Integer.toBinaryString(a1));
        int b1 = a1 >> 2;
        System.out.println(b1 + " "+ Integer.toBinaryString(b1));*/

        boolean result = 10>20 ? true : false;
        System.out.println(result);

        int n1 = 10,n2=30;

        int res = n1<n2?n1+n2:n2-n1;

        int res1 = n1>n2?(n1>10)?n1+1:n1-2:(n2>20)?n2+2:n2-2;
        System.out.println(res1);


    }
}
