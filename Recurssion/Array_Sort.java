import java.util.Scanner;

public class Array_Sort {
	public static boolean CheckArraySorted(int a[] , int startIndex) {
		if(startIndex == a.length-1) {
			return true;
		}

		if(a[startIndex] > a[startIndex + 1]) {
			return false;
		}
		boolean isSmallArraySorted = CheckArraySorted(a, startIndex + 1);
		return isSmallArraySorted;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int x = s.nextInt();
		
		System.out.println(CheckArraySorted(a, x));
	}
}
