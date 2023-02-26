package CalssCode;

 class Simple {

     Simple(String name)
    {
        System.out.println("Constructor with one "	+ "argument - String : " + name);
    }

    // constructor with two arguments
    Simple(String name, int age)
    {
        System.out.println(	"Constructor with two arguments : "
                + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous..
    Simple(long id)
    {
        System.out.println(	"Constructor with one argument : "
                + "Long : " + id);
    }
}

class Test3 {
    public static void main(String[] args)
    {
        Simple s1 = new Simple("Kumar");
        Simple s2 = new Simple("Avan", 26);
        Simple s3 = new Simple(325614567);
    }
}
