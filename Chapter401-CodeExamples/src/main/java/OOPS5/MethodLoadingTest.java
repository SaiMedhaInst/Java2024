package OOPS5;

class A{
     void fun(){
        System.out.println("class A fun impl");
    }
}

class B extends  A{
      void fun(){
        System.out.println("class B fun impl");
    }
}
class OverloadingCalculation3{
    void sum(int a,long b){System.out.println("a method invoked");}
    //void sum(long a,int b){System.out.println("b method invoked");}

}
public class MethodLoadingTest {

    public static void main(String args[]){
        OverloadingCalculation3 obj=new OverloadingCalculation3();
        obj.sum(20,20);//now ambiguity
    }
}
