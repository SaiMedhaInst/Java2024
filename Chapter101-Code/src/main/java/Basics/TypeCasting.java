package Basics;

public class TypeCasting {
    public static void main(String[] args) {

        int age = 9;

        double mydouble = age; //smaller --- larger. widening done by JVM.

        System.out.println(age);
        System.out.println(mydouble);


        double salary = 100.290390d; //larger -- smaller //explicit or narrow. Done by user
        int intvar = (int) salary;

        System.out.println(salary);
        System.out.println(intvar);

        //char into str

        String name = String.valueOf('A');

    }
}
