public class Ecet extends Exam {
    public void write() {
        System.out.println("ECET Exam write.. method");
    }

    public static int  m1(int n) {
        if(n==0){return 0;}
        System.out.println(n);
        return m1(n-1);
    }

    public static void main(String[] args) {
     System.out.println(m1(5));
    }
}