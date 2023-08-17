package EasyQs;

import java.util.Arrays;

public class Merge2SortedArrays {
	
	public static void bruteForce(int arr1[],int  arr2[], int n , int m) {
		int i = 0, j = 0, k = 0;
        int arr3[] = new int[n + m];
        
        while(i < n && j < m) {
        	if(arr1[i]<arr2[j]) {
        		arr3[k]=arr1[i];
        		i++;
        		k++;
        	}
        	else {
        		arr3[k]=arr2[j];
        		j++;
        		k++;
        	}
        }
        while(i<n) {
        	arr3[k]=arr1[i];
        	k++;
        	i++;
        }
        while(j<m) {
        	arr3[k]=arr2[j];
        	k++;
        	j++;
        }
        printArrays(arr3);
       
	}
	public static void optimalApproach1(int arr1[],int  arr2[], int n , int m) {
		//1st pointer will be at end of the array n-1.
		//and for 2nd pointer will be from 0th position.
		int left = n - 1;
        int right = 0;
        
		while(left >= 0 && right < m) {
			if(arr1[left] > arr2[right]) {
				int temp = arr1[left];
		         arr1[left] = arr2[right];
		         arr2[right] = temp;
		         left--;
		         right++;
			}
			else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	}
	public static void optimalApproach2(int arr1[],int  arr2[], int n , int m) {
		
	}
	public static void printArrays(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 4, 8, 10};
		int[] arr2 = {2, 3, 19};
		int n = 4, m = 3;
		optimalApproach2(arr1, arr2, n, m);
		
		
	}

}
