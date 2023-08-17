
public class Nth_Root_M {
	public static int Nthroot_M(int n,int m) {
		int ans=-1, multi=1;
		
		for(int i=0 ;i<n ;i++) {
			for (int j = 0; j < n; j++) {
				multi = multi*j;
			}
			if(multi == m) {
				ans = n;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3,m=27;
		System.out.println(Nthroot_M(n, m));
	}

}
