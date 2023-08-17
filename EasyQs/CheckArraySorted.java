package EasyQs;

public class CheckArraySorted {
	public static boolean checkIfSorted(int arr[] , int n) {
		for (int i = 1; i < n; i++) {
			if(arr[i] < arr[i-1]) 
				return false;
		}
		return true;
	}

	public static boolean method2(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n-1; j++) {
				if(arr[i] > arr[j]) 
					return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,5};
		int n =arr.length;
		System.out.print(checkIfSorted(arr, n));
	}
}
