package OOPS6;


class Adder{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,long b){System.out.println("b method invoked");}
}

public class MethodOverloadingExample {

    public static void main(String[] args){
        System.out.println("main with String[]");
        new Adder().sum(10,20);
    }


}
