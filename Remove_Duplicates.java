import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicates {
	public static ArrayList<Integer> removeDuplicates(int arr[]){
		ArrayList <Integer> output = new ArrayList<>();
		Map<Integer,Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			map.put(arr[i], true);

		}
		return output;

	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,3,4,3,5,6,7,4,33,3,6};
		ArrayList<Integer> output = removeDuplicates(arr);
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
}
