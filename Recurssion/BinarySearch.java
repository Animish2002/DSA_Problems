
public class BinarySearch {

	public static int binarySearch(int a[] ,int start , int end, int x ) {
		if(start>end) {
			return -1;
		}
		int mid =(start+end)/2;
		if(a[mid]==x) {
			return mid;
		}
		else if(a[mid]<x) {
			return binarySearch(a, mid+1, end, x);
		}
		else {
			return binarySearch(a, start, mid-1, x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,6,8,9};
		System.out.println(binarySearch(a, 0, a.length-1, 4));
	}

}
