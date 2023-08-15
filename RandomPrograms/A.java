import javax.xml.transform.stax.StAXResult;

class Student{
    public String name;
    public static int studentCount; 
    public Student(String name) {
        this.name = name;
        this.studentCount++;
    }

    public static int studentCount() {
        return studentCount;
    }

}

public class A {

    public static void main(String args){System.out.println("main with String");}  
    public static void main(){System.out.println("main without args");}  
    public static void main(String[] args) {
        
        Student students[] = new Student[5];

        for(int i=0;i<5;i++) {
            students[i] = new Student("Student-"+i);
        }
       
        System.out.println(Student.studentCount());
    }
}