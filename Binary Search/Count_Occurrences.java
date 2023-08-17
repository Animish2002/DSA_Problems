
public class Count_Occurrences {
	public static int countOccurrence(int arr[], int n , int x) {
		int cnt=0;
		for (int i = 0; i < n; i++) {
			if(arr[i]==x) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 8,  X = 2 , array[] = {1, 1, 2, 2, 2, 2, 2, 3};
		System.out.println(countOccurrence(array, N, X));
	}

}
