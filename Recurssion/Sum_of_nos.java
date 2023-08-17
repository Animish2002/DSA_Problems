
public class Sum_of_nos {
	public static long sumNumbers(long n) {

		if(n==0) {
			return 0;
		}
		return n + sumNumbers(n-1);


	}
	public static void main(String[] args) {

		System.out.print(sumNumbers(5));

	}
}
