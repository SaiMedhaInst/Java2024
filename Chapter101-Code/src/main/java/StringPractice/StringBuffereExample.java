package StringPractice;

public class StringBuffereExample {
    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);

        sb.insert(0,"Python");
        sb.insert(0, " ");
        System.out.println(sb);

        sb.replace(1,5,"PYTHON");
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);




    }
}
