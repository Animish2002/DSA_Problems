package EasyQs;

public class moveZeros {
	public static void pushZerosToEnd(int[] arr, int n) {
		// code here
		 int count = 0; // Count of non-zero elements

	        // Traverse the array. If the current element is non-zero, then swap it with the previous non-zero element.
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != 0) {
	                // Swap non-zero element with the previous non-zero element
	                int temp = arr[count];
	                arr[count] = arr[i];
	                arr[i] = temp;
	                count++;
	            }
	        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
	public static void main(String[] args) {

		int arr[]= {3, 5, 0, 0, 4};
		int n = arr.length;
		pushZerosToEnd(arr,n);
	}

}
