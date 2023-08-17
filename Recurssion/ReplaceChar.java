
public class ReplaceChar {
	public static String Replace_char(String s, char a, char b) {
		if(s.length() == 0) {
			return s;
		}

		String smaller_Output=Replace_char(s.substring(1), a, b);
		if(s.charAt(0)==a) {
			return b +smaller_Output;
		}
		else {
			return s.charAt(0)+smaller_Output;
		}
	}

	public static void main(String[] args) {
		System.out.println(Replace_char("abcxjxyz", 'x', 'y'));
	}
}
