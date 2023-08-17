
public class Palindrome_String {
	public static boolean isPalindrome(int i,String S) {

		// Base Condition
		// If i exceeds half of the string, means all the elements 
		// are compared, we return true.
		if(i>=S.length()/2) {
			return true;
		}
		// If start is not equal to end, not palindrome.
		
		if(S.charAt(i) != S.charAt(S.length() - i - 1)) {
			return false;
		}

		// If both characters are same, increment i and check start+1 and end-1.
		return isPalindrome(i+1,S);
	}
	public static void main(String[] args) {
			String s = "madm";
			System.out.println(isPalindrome(0,s));
	}
}
