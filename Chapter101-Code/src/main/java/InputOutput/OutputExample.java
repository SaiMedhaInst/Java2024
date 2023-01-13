package InputOutput;

public class OutputExample {
    public static void main(String[] args) {

        System.out.print("SaiMedha ");
        System.out.print("Institution ");

        System.out.println("Java ");
        System.out.println("course ");

        int x = 100;
        System.out.printf("Printing simple"+ " integer: x = %d\n",x);

        System.out.printf("Formatted with"+ " precision: PI = %.2f\n",Math.PI);

        float n = 5.2f;

        System.out.printf("Formatted to "+ "specific width: n = %.4f\n",n);

        n = 2324435.3f;

// here number is formatted from
// right margin and occupies a
// width of 20 characters
        System.out.printf("Formatted to "+ "right margin: n = %20.4f\n",n);
    }
}
