
public class Lower_Bound {
	public static int lowerBound1(int arr[], int n , int x) {
		for(int i=0 ;i<n ;i++) {
			if(arr[i] >= x)
				return i;
		}
		return n;
	}

	public static int lowerBound2(int arr[], int n, int x) {
		int ans=n;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>=x) {
				ans = mid;
				//look for smaller index on the left
				high = mid - 1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 8, 15, 19};
		System.out.println(lowerBound2(arr, 5, 9));
	}

}
