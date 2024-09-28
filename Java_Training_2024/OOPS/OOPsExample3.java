package OOPS;


class Student {
    private static String collegeName;
    private String name;
    private long rollNumber;

    static {
        collegeName = "JNTUK";
    }

    public Student() { // No- Argument
        System.out.println("I'm No-Args constructor..");
    }

    public Student(String n, long r) { // Paramterized
        this.name = n;
        this.rollNumber = r; 
    }

    public String getName() {
        return this.name;
    }

    public long getRollNumber() {
        return this.rollNumber;
    }

    public static String getCollege() {
        return collegeName;
    }

}


class Simple {

    Simple(String name) {
        System.out.println("Constructor with one "	+ "argument - String : " + name);
    }

    Simple(String name, int age) { // constructor with two arguments
        System.out.println(	"Constructor with two arguments : "
            + " String and Integer : " + name + " " + age);
    }

    Simple(long id) {
        System.out.println(	"Constructor with one argument : "
            + "Long : " + id);
    }
    
    Simple(int a, long b) {
        System.out.println("int, long constructor: " + (a+b));
    }
    
    Simple(long a, int b) {
        System.out.println("long, int constructor: " + (a+b));
    }
}

public class OOPsExample3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(Student.getCollege());

        System.out.println("****************************");

        Student s2 = new Student("surya", 102272);
        System.out.println(s2.getName());
        System.out.println(s2.getRollNumber());
        System.out.println(Student.getCollege());

        System.out.println("************************");
        Simple sm1 = new Simple("Kumar"); // first 
        Simple sm2 = new Simple("Avan", 26); // second
        Simple sm3 = new Simple(325614567); // third
        
        Simple sm4 = new Simple(10,20); // (long, long ) , (long, long)
    }
}
