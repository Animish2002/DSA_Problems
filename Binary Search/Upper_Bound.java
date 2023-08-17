
public class Upper_Bound {
	public static int upperBound(int arr[], int n,int x) {
		int low=0; int high=n-1;
		int ans=n;
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]>x) {
				ans=mid;
				
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3};
		int n=4;
		int x=2;
		System.out.println(upperBound(arr, n, x));
				

	}

}
