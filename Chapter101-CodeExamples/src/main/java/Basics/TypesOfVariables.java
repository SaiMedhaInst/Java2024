package Basics;

public class TypesOfVariables {
    // instance variables : accessible only using Object
    String name = "Kumar";
    int age;
    float salary;
    String subjectName;


    //static variables.... accesible only class Name

    static  int score = 10;
    static  String currency;

    public static void main(String[] args) {

        TypesOfVariables obj = new TypesOfVariables();

        System.out.println(obj.name);
        System.out.println(obj.salary);
        System.out.println(obj.subjectName);
        System.out.println(obj.age);

        System.out.println(TypesOfVariables.currency);
        System.out.println(TypesOfVariables.score);


    }
}
