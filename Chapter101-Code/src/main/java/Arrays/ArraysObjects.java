package Arrays;

class Student
{

    public String name;
    Student(String name)
    {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
public class ArraysObjects {
    public static void main(String[] args) {

        Student[] myStudents = new Student[]{new Student("Alex"),new Student("Tova"),new Student("Eyak"),new Student("Kumar")};

        // accessing the elements of the specified array
        for(Student m:myStudents){
            System.out.println(m);
        }
    }
}
