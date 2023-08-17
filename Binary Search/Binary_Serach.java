
public class Binary_Serach {
//	public static int binarySearch(int[] nums, int target) { //iterative apporach.
//		int n = nums.length;
//		int start=0;
//		int end = n-1;
//		
//		while(start <= end) {
//			int mid = (start+end)/2;
//			
//			if(nums[mid]==target) {
//				return mid;
//			}
//			else if(target < nums[mid]) {
//				end = mid - 1;
//			}
//			else if(target > nums[mid]) {
//				start= mid+1;
//			}
//		}
//		return -1;
//		
//	}
	
	public static int binarySearch(int[] nums, int target,int start,int end) { //recursive apporach.
		
		if(start>end) return -1;
		
		int mid=(start+end)/2;
		if(nums[mid] == target) return mid;
		else if (target > nums[mid])
			return binarySearch(nums, target,start,mid+1);
		
		return binarySearch(nums, target, start, mid-1);
	}
	
	public static int search (int[] nums,int target) {
		return binarySearch(nums, target,0, nums.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,5,7,9,12,23,45,87,98};
		
	}

}
