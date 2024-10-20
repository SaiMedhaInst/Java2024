public class LogicQuestions {
    public static void main(String[] args) {
        int arr[] = {3,0,9,6,1,2,6,2,9};
        findDuplicateNumbers(arr);
        findFirstDuplicateNumbers(arr);
    }

    private static void findFirstDuplicateNumbers(int[] arr) {
        boolean isFound = false;
        for(int i=0; i<arr.length; i++){
			for(int j = i+1 ; j<arr.length;j++){
				if(arr[i] == arr[j]){
                    isFound = true;
					System.out.println("found first duplicate num: " + arr[i]);
				}
			}
            if(isFound) 
                break;
		}
    }

    private static void findDuplicateNumbers(int[] arr) {
        for(int i=0; i<arr.length; i++){
			for(int j = i+1 ; j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.println("duplicate num: " + arr[i]);
				}
			}
		}
    }
}
