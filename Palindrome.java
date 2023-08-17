
public class Palindrome {

	public static String is_Palindrome(int n) {
		int temp=n;
		int reverse = 0;
		while(n>0) {
			int last_digit= temp%10;
			reverse =( reverse*10 )+last_digit;
            n=n/10;
		}
		
		if(reverse==temp) {
			return "Yes";
		}
		else {
			return "No";		
		}
	}
	public static void main(String[] args) {
		System.out.println(is_Palindrome(44));
	}
}
