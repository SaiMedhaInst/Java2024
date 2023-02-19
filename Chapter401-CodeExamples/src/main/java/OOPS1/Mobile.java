package OOPS1;

public class Mobile {

    private String name;
    private float price;
    private String color;

    public Mobile(){
        System.out.println("constructor called....");
        this.name="mi";
        this.price = 1000.2f;
        this.color="red";
    }
    public Mobile(String name, float price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public static void main(String[] args) {

        Mobile m = new Mobile();
        System.out.println(m.name);

        Mobile m2 = new Mobile("realme",12564656,"blue");
        System.out.println(m2.name);

    }
}
