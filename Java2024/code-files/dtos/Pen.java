package dtos;

public class Pen {
    private String name;
    private float price;
    private String color;

    public Pen() {
        System.out.println("default constructor is invoked...");
    }

    public Pen(String n,float p, String c) {
        System.out.println("PARAM CONSTRUCTOR IS INVOKED ..");
        this.name = n;
        this.price = p;
        this.color = c;
    }

    public void display() {
        System.out.println(
                 "PEN NAME = " + this.name + "\n" 
                + "PEN PRICE = " + this.price + "\n"
                + "PEN COLOUR = " + this.color + "\n"
            );
    }

}
