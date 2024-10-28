import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("hello world, welcome to exception handling");
        int arr[] = new int[] {10,20,30,40};
        methodA(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void methodA(int arr[]) {
        System.out.println("Method A");
        arr[0] = arr[0] * 10;
        methodB(arr);
    }

    private static void methodB(int[] arr) {
        System.out.println("Method B");
        arr[1] = arr[0] * 2 + arr[1] * 4;
        methodC(arr);
    }

    private static void methodC(int[] arr) {
        System.out.println("Method C");
        arr[3] = arr[0] + arr[5];
    }
}
