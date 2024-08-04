package StringPractice;

public class StringTest {
    public static void main(String[] args) {

       /* //using literals
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 );
        System.out.println(s2);
        System.out.println(s1.hashCode() + " "+s2.hashCode());

        String s3 = new String("SaiMedha");
        String s4 = new String("SaiMedha");

        System.out.println(s3.hashCode() + " "+ s4.hashCode());

        System.out.println(s1==s2);
        System.out.println(s3==s4);*/

        char[] ch={'j','a','v','a','t','p','o','i','n','t'};
        String s = new String(ch);
        System.out.println(s);

    }
}
