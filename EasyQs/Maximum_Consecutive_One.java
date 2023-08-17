package EasyQs;

public class Maximum_Consecutive_One {
	public static int maxConsecutiveOne(int nums[], int n) {
		int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= { 1, 1, 0, 1, 1, 1, 1,1,0,1 };
		int n = nums.length;
		System.out.print(maxConsecutiveOne(nums, n));
	}
}


