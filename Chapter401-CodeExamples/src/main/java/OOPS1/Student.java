package OOPS1;

public class Student {
    int rollno;
    String name;

    public Student(){
        System.out.println("No-Args Constructor called");
    }
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Student s = new Student(1,"kumar");
        Student s1 = new Student(2,"Ram");
    }
}
