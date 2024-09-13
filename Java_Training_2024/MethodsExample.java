public class MethodsExample {
    public static void main(String[] args) {


        // predefined methods : comes with java, written by java engineers
        String s = "SuRya";
        System.out.println(s.toLowerCase());  // predefine instance method

        System.out.println(Math.sqrt(5)); // predefined static method

        // UserDefined methods: written by users/programmers
        MethodsExample me = new MethodsExample(); // will create object

        // Given an array of integer, perform product of even indices elements and return result 
        int arr[] = {1,0,2,4,30,6,50,8};
        int prdResult = productOfEvenIndices(arr); // calling 
        System.out.println(prdResult);

        System.out.println(productOfEvenIndices(arr));

        System.out.println(me.addition(11,13)); // we can't call non static methods from static context
        
        System.out.println(me.operation(3,4));
    }

    public static int productOfEvenIndices(int[] arr) { // declaration
        int product = 1;
        for(int i = 0; i < arr.length; i+=2) {
            product = product * arr[i];
        }
        return product;
    }

    public int addition(int a, int b) { // instance method
        int sum = a + b;
        return sum;
    }

    public int operation(int a, int b) {
        // perform addition of a and b 
        // perform square of a 
        // add both results and retun
        return this.addition(a, b) + this.squareOfN(a);

    }

    public int squareOfN(int n) {
        return n*n;
    }

}
