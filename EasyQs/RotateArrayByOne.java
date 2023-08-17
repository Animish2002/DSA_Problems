package EasyQs;

public class RotateArrayByOne {

	public static void printArray(int arr[], int n) { 
		for (int i = 0; i < n; i++){ 
			System.out.print(arr[i]+ " "); 
		} 
	}


	public static int[] rotateArray(int arr[] ,int n) {

		int temp= arr[0];
		for(int i=0 ; i<n-1 ; i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		rotateArray(arr, n);
		printArray(arr, n);
	}

}
