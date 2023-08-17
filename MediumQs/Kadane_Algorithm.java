package MediumQs;

public class Kadane_Algorithm {
	public static int Maximumsubarray(int arr[], int n) {
		long sum = 0;
		long maxi = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			maxi = Math.max(maxi, sum);
		}
		return (int) Math.max(maxi, 0);
	}
	public static void main(String[] args) {
		int arr[]= {-7 -8 -16 -4 -8 -5 -7 -11 -10 -12 -4 -6 -4 -16 -10 };
		int n =arr.length;
		System.out.println(Maximumsubarray(arr, n));

	}

}
