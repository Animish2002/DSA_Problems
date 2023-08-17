package EasyQs;

import java.util.Scanner;

public class Sum_even_odd {
	public static void sumofOddandEven(int num){
		int Esum=0;			//even sum
		int Osum=0;			//odd sum
		while(num>0) {
			int lastno=num%10;
			if(lastno%2 == 0) {
				Esum+=lastno;
			}
			else {
				Osum+=lastno;
			}
			num=num/10;

		}
		System.out.println(Esum);
		System.out.println(Osum);
	}

	public static void main(String[] args) {
		// Write your code here
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
			int n = sc.nextInt();
			sumofOddandEven(n);
		}
	}
}
