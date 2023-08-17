
public class Last_occurrence {
	public static int lastOccurrence1(int arr[], int n , int target) {
		int occ=0;
		for(int i=n-1; i>0; i--) {
			if(arr[i]==target) {
				occ=i;
				return occ;
			}
		}
		return -1;
	}
	
	public static int lastOccurrence2(int arr[], int n , int target) {
		int low=0; int high=n-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				ans=mid;
				low=mid+1;
			}
			else if(arr[mid]>target) {
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
		int N = 7, target=13;
		int array[] = {3,4,13,13,13,20,40};
		System.out.println(lastOccurrence2(array, N, target));

	}

}
