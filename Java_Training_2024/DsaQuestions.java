import java.util.Arrays;
import java.util.HashMap;

public class DsaQuestions {
    public static void main(String[] args) {
        // Two sum problem 
        int arr[] = new int[] {2, 7, 11, 15};
        int target = 22;
        twoSumProblem(arr, target);

        // Prefix Sum Pattern: find sum of sub array from index i to j
        arr = new int[] {2, 4, 6, 8, 10};
        int i=1,j=3;
        prefixSum(arr, i, j);
    }

    private static void prefixSum(int[] arr, int start, int end) {
        // Native or Bruteforce approach 
        // single query: O(n)
        // multiple queries, m queries: O(n * m)
        int sumarraysum = 0;
        for(int i = start; i <= end; i++) {
            sumarraysum += arr[i];
        }
        System.out.printf("sub array sum from (%d to %d) indices: %d\n", start, end, sumarraysum);

        // using Prefix Sum approach : O(n) for multiple queries
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0]; // assign 0th index 
        for(int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        //System.out.println(Arrays.toString(prefixSum));
        // sub array sum from index i to j
        sumarraysum = prefixSum[end] - prefixSum[start-1];
        System.out.printf("sub array sum from (%d to %d) indices: %d\n", start,end,sumarraysum);
    }

    private static void twoSumProblem(int arr[], int target) {
        // Method-1: Bruteforce method : iterate using two loops 
        // Time complexity: o(n^2)
        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("target:%d found at indices: (%d, %d)\n" , target, i,j);
                }
            }
        }

        // Method-2: using Hashing {2: 0, 7:1, 11:2, 15:3}
        // Time complexity: O(n)
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; //  target - num
            if (numToIndex.containsKey(complement)) {
                System.out.printf("target:%d found at indices: (%d, %d)\n", 
                target, numToIndex.get(complement), i);
            } else {
                numToIndex.put(arr[i], i);
            }
        }
    }

}
