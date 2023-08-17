public class MergeSort {
	public static int mergeSort(int[] a,  int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		mergeSort(a, start, mid);
		mergeSort(a, mid+1, end);
		merge(a, start, end);
	}

	private static void merge(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int mid=(start+end)/2;
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(a[i] <)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
