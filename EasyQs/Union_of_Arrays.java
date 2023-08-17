package EasyQs;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashSet;

public class Union_of_Arrays {
	public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m){
		//		HashMap<Integer, Integer> freq = new HashMap<>();
		ArrayList <Integer> Union = new ArrayList<>();
		//		
		//		for(int i=0; i<n ;i++) {
		//			freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
		//		}
		//		
		//		for(int i=0; i<m ;i++) {
		//			freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
		//		}
		//		
		//		
		//		for (int it:freq.keySet()) 
		//			Union.add(it);
		//			return Union;
		HashSet<Integer> set = new HashSet<>();

		for(int i:arr1)
			set.add(i);

		for(int i:arr2)
			set.add(i);

		for(int it: set)
			Union.add(it);
		return Union;

	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,54,5,6,7,5,14};
		int arr2[]= {2,7,8,9,10,11,12};
		int n=arr1.length;
		int m=arr2.length;
		System.out.print(FindUnion(arr1, arr2, n, m));
	}

}

//
//HashSet<Integer>set=new HashSet<>();
//ArrayList<Integer>list=new ArrayList<>();
//
//for(int i:arr1){
//    set.add(i);
//}
//for(int j:arr2){
//    set.add(j);
//}
//for(int x:set){
//    list.add(x);
//}
//Collections.sort(list);
//return list;