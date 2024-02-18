import dtos.Employee;
import dtos.Pen;

public class OopsExample {
    public static void main(String[] args) {
        Pen pen = new Pen("Octane",20.5f,"blue");
        System.out.println(pen);
        pen.display();

        Employee e1 = new Employee(); // default constructor
        e1.setEmpName("Prakash");
        e1.setEmpDeptName("IT");
        e1.setEmpAge(25);
        e1.setEmpSalary(72782.5f);

        //System.out.println(e1.getEmpAge());
        System.out.println(e1); // calls toString()
    
    }
}
