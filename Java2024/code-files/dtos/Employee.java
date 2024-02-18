package dtos;

public class Employee {
    
    private String empName;
    private String empDeptName;
    private int empAge;
    private float empSalary;


    public Employee() {
    }


    public Employee(String empName, String empDeptName, int empAge, float empSalary) {
        this.empName = empName;
        this.empDeptName = empDeptName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }


    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empDeptName=" + empDeptName + ", empAge=" + empAge + ", empSalary="
                + empSalary + "]";
    }


    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getEmpDeptName() {
        return empDeptName;
    }


    public void setEmpDeptName(String empDeptName) {
        this.empDeptName = empDeptName;
    }


    public int getEmpAge() {
        return empAge;
    }


    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }


    public float getEmpSalary() {
        return empSalary;
    }


    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    

    

    
    
}
