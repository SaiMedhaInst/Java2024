public class OutputInJavaExample {
    public static void main(String[] args) {

            System.out.print("SaiMedha ");
            System.out.print("Institution ");
            
            System.out.println("Java ");
            System.out.println("course ");

            int x = 100;
            System.out.printf("Printing simple integer: x = %d\n",x);

            System.out.printf("Formatted with precision: PI = %.2f\n",Math.PI);

            float n = 5.2f;

            System.out.printf("Formatted to specific width: n = %.4f\n",n);

            n = 2324435.3f;

            // here number is formatted from
            // right margin and occupies a
            // width of 20 characters
            System.out.printf("Formatted to right margin: n = %20.4f\n",n);

            String name = "ram";
            String collegeName = "NGIT";
            String course = "ECE";
            float fee = 750002.2F;

            // Hello My name is ram, am studing in NGIT college in ECE branch, and fee is 750002.2

            System.out.println("hello my name is " + name +", am studing in " +collegeName +" college in " +course +" branch, and fee is " +fee);
            System.out.printf("Hello My name is %s, am studing in %s college in %s branch, and fee is %.2f",name,collegeName,course,fee);

            System.err.println("GeeksForGeeks!");

    }
}
