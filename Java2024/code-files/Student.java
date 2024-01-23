public class Student {
    // static variables
    static String collegeName = "SRI INDU";

    // instance variables 
    String name;
    String stream;
    char section;

    //constructor
    Student(String a,String b, char c) {
        this.name = a;
        this.stream = b;
        this.section = c;
    }

    // instance method
    void displayStudent() {
        System.out.printf("My name is %s, studing in %s | %c, IN %s college \n",name,stream,section, Student.collegeName);
    }

    public static void main(String[] args) {

        // create object
        Student kumar = new Student("kumar rajamoni", "CSE", 'A');
        System.out.println(kumar);
        kumar.displayStudent();

        Student srikanth = new Student("srikanth yadav", "BSC", 'B');
        srikanth.displayStudent();
        
    }
}