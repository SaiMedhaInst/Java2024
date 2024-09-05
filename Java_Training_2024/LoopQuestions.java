public class LoopQuestions {
    public static void main(String[] args) {

        // find the largest num
        int arr[] = {1,-19,17,25,-26,9,6};
        int largest = Integer.MIN_VALUE; // -2147483648
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // update largest to current element
            }
        }
        System.out.println("largest num: " + largest);

        // find the second largest num
        // method -1 
        // find largest number using first for loop 
        // find second largest excluding the largest num calculated in first for loop 
        int nums[] = {12,35,1,9,96,34,1};
        int firstLargest=0;  // index location
        int secondLargest=-1;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] > nums[firstLargest]) {
                firstLargest = i; // update current index to firstLargest
            }
        }
        System.out.println("index of first largest element: " + firstLargest);

        for(int i=0;i<nums.length; i++) {
            if(nums[i] != nums[firstLargest]) {
                if (secondLargest == -1) {
                    secondLargest = i;
                } else if (nums[i] > nums[secondLargest]) {
                    secondLargest = i;
                }                   
            }   
        }
        System.out.println("second largest element index: " + secondLargest);

        // method-2 {1,-19,17,25,-26,9,6};
        int first,second;
        first=second=Integer.MIN_VALUE; // -2147483648
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > first) {
                second = first; // update first into second
                first = arr[i]; // update current ele into first
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i]; // update current ele into second
            }
        }
        System.out.println("first largest: " + first);
        System.out.println("second largest: " + second);

        // find the factorial
        // product of nums 3! = 1 * 2 * 3 => 6
        int n = 5;
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.printf("factorial of %d is %d\n", n, fact);


        // find the sum of first n numbers 
        // n = 5 => 1+2+3+4+5 -> 15
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.printf("sum of first %d natural numbers is %d \n", n, sum);


        // Linear Search : searching the element sequentially 
        // if element is found return index else return default -1 
        // Time Complexity: O(n)
        int data[] = {11,22,10,20,96,67,18};
        int element = 200;
        int keyIndex = -1;
        for(int i=0; i<data.length; i++) {
            if (data[i] == element) 
                keyIndex = i;
        }
        
        System.out.println( keyIndex != -1 ? String.format("element: %d found at index: %d", element, keyIndex): String.format("element: %d doesn't exist", element));


    }
    
}
