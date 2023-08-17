
public class Armstrong_Numbers {
	public static String armstrongNumber(int n){
		int temp = n;
		int sum = 0;

		while(n>0) {
			int lastDigit = n%10;
			sum = sum + (int)Math.pow(lastDigit,3);
			n=n/10;
		
		}
		if(sum == temp) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
	public static void main(String[] args) {
		System.out.println(armstrongNumber(36));
	}
}
