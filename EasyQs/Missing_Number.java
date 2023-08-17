package EasyQs;

public class Missing_Number {
	////	public static int missing_Number(int arr[], int n) {
	//
	//		for (int i = 1; i < n; i++) {
	//			int flag=0;
	//			for (int j = 0; j <n-1; j++) {
	//				if (arr[j] == i) {
	//
	//					flag++;
	//				}
	//			}
	//			if (flag == 0) return i;
	//		}
	//		return -1;
	//	}


	//	public static int missing_Number2(int arr[],int N) {
	//		int hash[] = new int[N + 1]; //hash array
	//
	//		// storing the frequencies:
	//		for (int i = 0; i < N - 1; i++)
	//			hash[arr[i]]++;
	//
	//		//checking the freqencies for numbers 1 to N:
	//		for (int i = 1; i <= N; i++) {
	//			if (hash[i] == 0) {
	//				return i;
	//			}
	//		}
	//		return -1;
	//	}

	public static int missing_Number3(int arr[], int n) {
		int XOR1=0;
		int XOR2=0;
		for(int i=0; i<n-1;i++) {
			XOR2 = XOR2^arr[i]; //all arr elements
			XOR1 = XOR1 ^ (i+1);  //1 to n-1
		}
		XOR1 = XOR1 ^ n;

		return (XOR1 ^ XOR2);

	}
	
//	public int missingNumber(int[] nums) {
//        int n = nums.length;
//        int totalSum = n*(n+1)/2;
//        for(int i=0;i<n;i++){
//            totalSum -= nums[i];
//        }
//        return totalSum;
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6};
		System.out.println(missing_Number3(arr, arr.length));
	}
}
