import java.util.Scanner;

public class FindIndexNo {
	public static int firstIndex(int[] a, int x) {

		if(a.length == 0) {
			return -1;
		}
		if(a[0] == x) {
			return 0;
		}

		int[] smallArray = new int[a.length-1];
		for (int i = 0; i < a.length; i++) {
			smallArray[i-1] =a[i];
		}
		int fi = firstIndex(smallArray, x);
		if(fi == -1) {
			return -1;
		}
		else {
			return fi +1;
		}
	}
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(FindIndexNo.firstIndex(input, x));
	}
}