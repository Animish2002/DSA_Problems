
public class Insertion_Sort {
	public static int[] insertionSort(int arr[], int n) {

	}


	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {6,3,2,4,5,1};
		int n = arr.length;
		insertionSort(arr, n);
		printArray(arr, n);
	}
}
