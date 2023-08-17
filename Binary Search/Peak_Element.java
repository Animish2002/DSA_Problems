
public class Peak_Element {
	public static int peakElement(int arr[], int n ) {
		int maxi=0;
		int ans = 0;
		for(int i=0; i<n ; i++) {
			
			if(arr[i]>maxi) {
				maxi=arr[i];
				ans=i;
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,5,1};
		System.out.println(peakElement(arr, arr.length));
	}

}
