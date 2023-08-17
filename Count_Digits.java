public class Count_Digits{
	public static int evenlyDivides(int N) {
		// code here
		int temp = N;
		int count = 0;
		while(N > 0) {
			int digit = N % 10;
			if(digit != 0 && temp % digit == 0) {
				count++;
			}
			N = N / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(evenlyDivides(133));
	}
}