package MediumQs;

public class Two_Sum {
	public static int[] twoSum(int arr[], long k) {
		int n =arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]+arr[j] == k) 
					return new int[]{i,j};
			}
		}
		return null;
	}
	public static void main(String[] args) {

		int[] arr = {2, 6, 5, 8, 11};
		int target = 14;
		int[] result = twoSum(arr, target);

		if (result != null) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No two elements found with the given sum.");
		}
	}

}
