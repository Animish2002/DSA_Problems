package MediumQs;

public class Rearrange_Array {
	public static int[] rearrangeArray(int arr[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n;i++) {
				if(arr[i])
			}
		}
	}

	public static void swap(int arr[], int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]= temp;

	}

	public static void printArray(int arr[]) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
