package EasyQs;

import java.util.HashMap;

public class longestSubarrayForSum_K {
	public static int getLongestSubarray(int arr[], long k) {
		int n = arr.length;
		long sum=0;
		int maxLen=0;
		
		HashMap<Long, Integer> map= new HashMap<>();
		
		for(int i=0; i<n ;i++) {
			sum+=arr[i];
			
			if(sum==k) {
				maxLen = Math.max(maxLen, i+1);
			}
			long rem = sum-k;
			
			if(map.containsKey(rem)) {
				int len = i - map.get(rem);
				maxLen = Math.max(maxLen,len);

			}
			
			if(!map.containsKey(sum)) {
				map.put(sum,i);
			}
		}
		return maxLen;
	}
	public static void main(String[] args) {
		 int[] a = {2, 3, 5};
	     long k = 5;
	     int len = getLongestSubarray(a, k);
	     System.out.println(len);
	}

}
