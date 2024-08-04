package StringPractice;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        builder.insert(0,"Hey");

        System.out.println(builder);
    }
}
