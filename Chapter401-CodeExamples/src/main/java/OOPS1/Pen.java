package OOPS1;

public class Pen {

    private String color;
    private float price;

    public Pen(String color, float price) {
        this.color = color;
        this.price = price;
    }

       Pen() {
        System.out.println("no args");
    }

    public void job(){
        System.out.println("my job is writing...");
    }

    public String toString(){
        return  String.format("I'm %s color PEN of price %f",color,price);
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "red";
        p.price=15.5f;
        p.job();
        System.out.println(p);
    }
}

