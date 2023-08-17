

public class LCM {
	public static int lcm(int n1, int n2) {
		int gcd = 1;
		for(int i=0 ; i< Math.min(n1,n2); i++) {
			if(n1 % i==0 && n2 % i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		System.out.println(lcm(10, 5));
	}

}
