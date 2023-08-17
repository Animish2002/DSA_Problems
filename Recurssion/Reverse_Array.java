import java.util.Arrays;
import java.util.Collections;

public class Reverse_Array {
	static void printArray(Integer arr[], int n) {
	      System.out.print("Reversed array is:- \n");
	      for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
	   //Reverse array using library function
	   static void reverseArray(Integer arr[]) {
	      //fetching array as list object
	      //reversing the fetched object
	      Collections.reverse(Arrays.asList(arr));
	   }
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5};
		int n=arr.length;
		reverseArray(arr);
		printArray(arr, n);
	}
}
