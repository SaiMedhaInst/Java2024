package arrays;

public class Test {

    public  static  void ArrayTranversal(){

        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
        //traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);
    }

    public  static void minArrElement(int array[]){

        int min = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }

        System.out.println("minimum element in array : "+min);
    }

    public  static void maxArrElement(int array[]){

        int max = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println("maximum element of array : "+max);
    }

    public static int[] studentMarks(){
        return new int[]{87,85,89,78};
    }


    public static void main(String[] args) {
        ArrayTranversal();


        int a[]={33,3,4,5};//declaration, instantiation and initialization

        System.out.println();
        //printing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);

        //printing array using for-each loop
        int arr[] = new int[]{3,0,9,6};
        for(int i:arr)
            System.out.println(i);

       // Passing Array to a Method in Java
        minArrElement(arr);

        //Anonymous array
        //Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

        maxArrElement(new int[]{30,96,12,25,26});


        int[] marks = studentMarks();

        for(int m:marks) System.out.print(m+" ");

        System.out.println("array proxy class name: "+marks.getClass().getName());
        System.out.println("".getClass().getName());
    }
}
