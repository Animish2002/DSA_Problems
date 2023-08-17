
public class print_N_numbers {

	public static void printNos(int i, int N){

		// Base Condition.
		if(i<1){
			return;
		}
		System.out.print(i+" ");
		printNos(i-1,N);
		//System.out.print(i+" ");

	}


	public static void main(String[] args) {
		int N=10;
		printNos(N,N);
	}
}
