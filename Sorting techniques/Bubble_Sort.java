
public class Bubble_Sort {

	public static int[] bubbleSort(int[] arr, int n) {
		for (int i = n-1; i >=0 ; i--) {
			for (int j = 0; j < i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,1,2,5,7,9,8,6,10};
		int n=arr.length;
		System.out.println(n);
		bubbleSort(arr, n);
		printArray(arr, n);

	}

}
