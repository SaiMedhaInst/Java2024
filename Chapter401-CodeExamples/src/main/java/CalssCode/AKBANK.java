package CalssCode;

interface Area {
    //public static final --> variables
    // public abstrat --> methods

    double PI = 3.1456;
     double area();// AM

     default void display(){ //DM
        System.out.println("display method for printing...");
    }
     static void printer(){//SM
        System.out.println("am a printer method.....");
    }
}

class Traingle implements Area{

    @Override
    public double area() {
        return PI*20.2f;
    }
}

class Rectangle implements Area{

    @Override
    public double area() {
        return 56.23f;
    }
}

class Driver{
    public static void main(String[] args) {
        Area a = new Traingle();
        System.out.println(a.area());
        a.display();
        Area.printer();
    }
}
