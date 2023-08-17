
public class Find_Element_in_Rotated_Sorted_Array {
	public static Boolean findElement(int arr[], int n, int x) {
		int low=0;
		int high=n-1;
		
		while(low<=high) {
			int mid=(low+high)/2;

			if(arr[mid]==x) {
				return true;
			}

			if(arr[low]<=arr[mid]) {
				if(arr[low]<=x && x <= arr[mid]) {
					high=mid-1;
				}
				else {
                    // element does not exist
                    low = mid + 1;
                }
			}
			else {
				if(arr[mid]<=x && x<=arr[high]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}

		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2,3};
		int k=1;
		int n=arr.length;
		System.out.println(findElement(arr, n, k));
	}

}
