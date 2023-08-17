
public class patterns {
	public static void print1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void print2(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void print3(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void print4(int n) {
		//triangle
		for (int i=0; i <n ; i++) {
			for (int j = 0; j <n-i-1; j++) {
				System.out.print("  ");
			}
			for (int j2 = 0; j2 <2*i+1; j2++) {
				System.out.print("* ");
			}
			for (int j = 0; j <n-i-1; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void print5(int n) {
		for (int i = 0; i < n; i++) {
			//space
			for (int j = 0; j <i; j++) {
				System.out.print("  ");
			}
			//star
			for (int j2 = 0; j2 <2*n-(2*i+1) ; j2++) {
				System.out.print("* ");
			}
			//space
			for (int k = 0; k <i; k++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void print6(int n) {
		int num=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
	}
	public static void print7(int n) {
		for (int i = 0; i < n; i++) {
			for (char ch = 'A'; ch<='A'+i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void print8(int n) {
		for (int i = 0; i < n; i++) {
			for (char ch = 'A'; ch<='A'+n-i-1;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void print9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print((char)((int)('A'+i)));
			}
			System.out.println();
		}
	}
	public static void print10(int n) {
		   for(int i = 1; i<= n; i++){
	            char ch = 'A';
	            for(int k = 0; k <= n-i-1;k++){
	                System.out.print(" ");
	            }
	            for(int j = 1; j <= 2*i-1; j++){
	                System.out.print(ch);
	                if(j >= i )
	                    ch--;
	                else
	                    ch++;
	            }
	            System.out.println();
		}
	}
	public static void print11(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i; k>0 ;k--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void print12(int n) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            for (int k = i + 1; k <= n; k++) {
                System.out.print(k);
            }
            System.out.println();
		}
	}
	public static void print13(int n) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
		for(int i = n-1 ;i>=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int n = 7;
		print13(n);
	}
}
