package EasyQs;

import java.util.Arrays;

public class SecondLargest_SmallestElement {
	public static void method1(int arr[], int n) {		//Time Complexity O (n logn)
		Arrays.sort(arr);
		System.out.println(arr[1]);
		System.out.println(arr[n-2]);
	}

	public static int method2(int arr[], int n) {
		int max=0;
		for(int i=0; i<n ;i++)
		{
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int max2=0;
		for(int i=0 ; i<n; i++){
			if(max2<arr[i] && arr[i]<max){
				max2=arr[i];
			}
		}
		return max2;
	}

	public static void method3(int arr[], int n) {

	}
	public static void main(String[] args) {
		int arr[]= {11,23,45,5,1,2};
		int n =arr.length;
		//method1(arr, n);
		System.out.println(method2(arr, n));
	}

}
