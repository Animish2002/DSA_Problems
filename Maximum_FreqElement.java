import java.util.HashMap;

public class Maximum_FreqElement {
	public static int maxFrequencyNumber(int arr[], int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		int max = 0, ans = Integer.MIN_VALUE;
		for (int i : arr) {
			if (hm.get(i) > max) {
				max = hm.get(i);
				ans = i;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
