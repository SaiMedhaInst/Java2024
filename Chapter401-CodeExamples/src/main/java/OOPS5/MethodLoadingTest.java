package OOPS5;


class Student{
    public String toString(){
        return "hello world object";
    }
}
class OverloadingCalculation3{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

}
public class MethodLoadingTest {

    public static void main(String args[]){
        OverloadingCalculation3 obj=new OverloadingCalculation3();
        Student s = new Student();
        System.out.println(s);
    }
}
