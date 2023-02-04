package methods;

public class StaticMethods {

    public static int factorial(int num){
        int fac = 1;
        for(int i=1;i<=num;i++){
            fac = fac*i;
        }
        return fac;
    }

    public static int sumOfNumbers(int num){
        int s = 0;
        for(int i=0;i<=num;i++){
            s = s+i;
        }
        return s;
    }
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(sumOfNumbers(5));
    }
}
