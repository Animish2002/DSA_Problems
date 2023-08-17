
public class Search_InsertPosition {
	public static int searchPosition(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if(arr[i]>=x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,7};
		int x = 6;
		System.out.println(searchPosition(arr, arr.length, x));
	}

}
