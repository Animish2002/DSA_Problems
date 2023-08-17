package MediumQs;

public class StocksBuySell {
	public static int maximumProfit(int arr[]) {
		int maxPro = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			minPrice = Math.min(arr[i], minPrice);
			maxPro = Math.max(maxPro, arr[i] - minPrice);
		}
		return maxPro;
	}

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		int maxPro = maximumProfit(arr);
		System.out.println("Max profit is: " + maxPro);

	}
}
