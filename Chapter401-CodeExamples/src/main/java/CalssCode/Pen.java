package CalssCode;

public class Pen {
    // instance variables or object variables --> state of an object
    private String name;
    private String color;
    private float price;

    public void write(){
        System.out.println("my job is to write....");
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        p.name = "ball pen";
        p.color = "red";
        p.price = 15.5f;
        p. write();
        System.out.println(p.name + " "+ p.color+" "+p.price);

        Pen p2 = new Pen();
        p2.name = "some pen";
        p2.color = "blue";
        p2.price = 12.5f;
        System.out.println(p2.name + " "+ p2.color+" "+p2.price);
    }
}


