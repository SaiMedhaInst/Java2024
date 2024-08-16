public class StringBuilderExample {
    public static void main(String[] args) {


        // StringBuilder 
        System.out.println("******** Example - 1 **********");
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        System.out.println("******** Example - 2 **********");
        StringBuilder sb2 = new StringBuilder("Jai Balayya");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());


        System.out.println("******** Example - 3 **********");
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.append("Hi Java World Python");

        System.out.println(sb3.length());
        System.out.println(sb3.capacity());


        System.out.println("******** Example - 4 **********");
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity());
        sb4.append("Hello World");
        sb4.append(" Java");
        System.out.println(sb4.capacity());

        sb4.append(" Python");
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

        // methods 
        System.out.println("******** METHODS **********");
        // append()
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb);

        // insert() 
        sb.insert(0, "Hi ");
        System.out.println(sb);

        // delete 
        sb.delete(0, 4);
        System.out.println(sb);

        // reverse 
        sb.reverse();
        System.out.println(sb);
        
        // setLength()
        System.out.println(sb.length());
        System.out.println(sb.capacity());
       
        sb.setLength(5);

        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());


    }
}
