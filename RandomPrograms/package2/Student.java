package package2;

public class Student {
    String name;
    int rollNo;
 
    public Student() {
        System.out.println("no args");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
      
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
