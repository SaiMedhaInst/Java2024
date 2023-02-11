package OOPS2;

public class Phone {

    protected String name;
    protected String model;
    protected String processor;
    protected float price;

    public Phone(String name, String model, String processor, float price) {
        this.name = name;
        this.model = model;
        this.processor = processor;
        this.price = price;
    }

    protected void callingFun(){
        System.out.println("invoked calling function...");
    }

    @Override
    public String toString() {
        return "Phone{" + "name='" + name + '\'' + ", model='" + model + '\''
                + ", processor='" + processor + '\'' + ", price=" + price + '}';
    }
}

class iPhone extends Phone{

    public iPhone(String name, String model, String processor, float price) {
        super(name, model, processor, price);
    }

    @Override
    protected void callingFun(){
        System.out.println("invoked child class calling function...");
    }


}

class Driver{
    public static void main(String[] args) {
        iPhone ip = new iPhone("iPhone","13","A15 Bionic",61000);
        System.out.println(ip);
        ip.callingFun();
    }
}


