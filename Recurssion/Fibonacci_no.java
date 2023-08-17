
public class Fibonacci_no {
	public static int fib(int n) {
		if(n <=1 ) {
			return n;
		}
		int last = fib(n-1);
		int secl = fib(n-2);
		
		return last +secl;
		
		
	}

	public static void main(String[] args) {
		System.out.println(fib(4));
	}
}
