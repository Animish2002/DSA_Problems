
public class Selection_Sort {

	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] selectionSort(int arr[], int n) {
		
		for (int i = 0; i < n; i++) {
			int min=i;
			for (int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min=j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {4,3,1,2,5,7,9,8,6,10};
		int n=arr.length;
		selectionSort(arr, n);
		printArray(arr, n);
		
	}
}
