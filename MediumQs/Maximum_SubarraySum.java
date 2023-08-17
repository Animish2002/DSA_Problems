package MediumQs;

public class Maximum_SubarraySum {
	public static int maximumSubarray1(int arr[], int n) {
		int maxi= Integer.MIN_VALUE;
		for (int i = 0; i <n; i++) {
			for (int j = i; j <n; j++) {
				int sum =0;
				for (int j2 = i; j2 < j; j2++) {
					sum=sum+arr[j2];
				}
				maxi=Math.max(maxi, sum);
			}
		}
		return maxi;
	}
	public static int maximumSubarray2(int arr[], int n) {
		int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
              
                sum += arr[j];
                maxi = Math.max(maxi, sum); 
            }
        }

        return maxi;
	}
	public static int maximumSubarray3(int arr[], int n) {
		  long sum = 0;
		    long maxi = Integer.MIN_VALUE;

		    for (int i = 0; i < n; i++) {
		        sum = Math.max(arr[i], sum + arr[i]);
		        maxi = Math.max(maxi, sum);
		    }
		    return (int) Math.max(maxi, 0);
	}
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSubarray3(arr, arr.length));

	}

}
