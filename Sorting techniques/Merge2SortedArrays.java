
public class Merge2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,3,6,8,14};
		int arr2[]= {1,4,5,9,10};
		int n=arr1.length;
		int m=arr2.length;
		int arr3[]= new int[n+m];
		
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(arr1[i] < arr2[j]) {
				arr3[k]= arr1[i];
				i++;
			}
			else {
				arr3[k]= arr2[j];
				j++;
			}
			k++;
		}
		while(i<n) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			arr3[k] = arr1[j];
			j++;
			k++;
		}
		
		for (i=0 ; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}

}
