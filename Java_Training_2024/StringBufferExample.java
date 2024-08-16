public class StringBufferExample {
    public static void main(String[] args) {
        

        // String Buffer is created using new operator 
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Hello World");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer(10);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        // append 
        sb3.append("Hello Java World");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        // insert
        sb3.insert(0, "Hi ");
        System.out.println(sb3);

        // delete
        sb3.delete(0, 5);
        System.out.println(sb3);

        // revere 
        StringBuffer sb4 = new StringBuffer("Hi Kumar");
        sb4.reverse();
        System.out.println(sb4);

        String resStr = sb4.toString(); // StringBuffer - String 
        System.out.println(resStr);

    }
}
