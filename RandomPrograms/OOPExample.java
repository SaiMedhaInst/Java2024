public class OOPExample {

    int num;
    private OOPExample(int num) {
        System.out.println("OOPS example constructor");
        this.num = num;
    }

    public void hi() {
        System.out.println("greeted hiii...");
    }

    public static OOPExample getInstance() { //factory method.
        return new OOPExample(10);
    }
    public static void main(String[] args) {
        
        //System.out.println(new OOPExample(10).num);
        getInstance().hi();


    }
}
