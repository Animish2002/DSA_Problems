import java.util.ArrayList;

class Solution {
	public static void merge(int arr[], int low, int high, int mid) {
		ArrayList<Integer> temp= new ArrayList<>();
		int left = low;
		int right = mid+1;

		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		//for remaining elements

		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=mid) {
			temp.add(arr[right]);
			right++;
		}
	}


	public static void mergeSort(int[] arr, int low , int high) {

		int mid=(low+high)/2;

		mergeSort(arr, low, high);
		mergeSort(arr, mid+1, high);
		merge(arr, low, high, mid);
	}
}

public class Merge_Sort{
	public static void main(String[] args) {
		int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
		int n=arr.length;
		Solution.mergeSort(arr, 0, n-1);
		System.out.println("After sorting array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
