package MediumQs;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
	public static int majorityElement0(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int cnt=0;
			for (int j = i; j < n; j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
			}
			if(cnt > (n/2)) {
				return arr[i];
			}
		}
		return -1;
	}

	public static int majorityElement1(int arr[]) {
		int n=arr.length;
		
		HashMap<Integer,Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int value = map.getOrDefault(arr[i], 0);
			map.put(arr[i], value+1);
		}
		
		 for (Map.Entry<Integer, Integer> it : map.entrySet()) {
	            if (it.getValue() > (n / 2)) {
	                return it.getKey();
	            }
	        }
		 return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2, 2, 1, 1, 1, 2, 2, 2, 1, 1};
		int ans=majorityElement1(arr);
		System.out.println("The majority element is: " + ans);
		System.out.println(arr.length);
	}

}
