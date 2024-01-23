public class VariableExamples {
    public static void main(String[] args) {
        String name = "Srikanth";
        String college = "JNIT";
        int age = 22;
        float college_fee = 97000.282F;
        double grade = 4.2;
        char section = 'A';
        boolean is_student = true;

        System.out.println(name);
        System.out.println(college);
        System.out.println(age);
        System.out.println(college_fee);
        System.out.println(grade);
        System.out.println(section);
        System.out.println(is_student);

        age = 35; //changing age variable value
        System.out.println(age);

        // any decimal or float number is consider as double
        // any whole number is consider as int
        
        final double PI = 3.14;
        System.out.println(PI);
        
        //PI = 3.17;
        //System.out.println(PI);

        //variables rules 
        String student_name = "srikanth"; // snake case
        int number_of_students_in_college = 400;
        int cricketScore = 600; // camelCase
        int numberOfStudentsInCollege = 400; //camelCase

        int myFavNum = 9; //valid
        int _myFavNum = 9; // valid
        // int 10myFavNum = 9; // invalid
        // int class = 5002; // invalid



        
    }

    System.out.println(name);
}