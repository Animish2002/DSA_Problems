package EasyQs;
import java.util.Arrays;


public class Largest_element {							//Time complexity O(n logn)
	public static void method1(int arr[], int n) {
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
	}

	public static int method2(int arr[], int n) {       ////Time complexity O(n)
		int max=0;
		for (int i = 0; i < n; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {11,23,45,5,1,2};
		int n =arr.length;
		System.out.println(method2(arr, n));
//		method1(arr, n);

	}
}
