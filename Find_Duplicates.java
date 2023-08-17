import java.util.ArrayList;
import java.util.HashMap;

public class Find_Duplicates {
	public static int duplicate(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0 ; i<arr.size(); i++) {
			int num = arr.get(i);

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}

			if (map.get(num) > 1) {
				return num; // Return the first duplicate found
			}
		}
		return -1;
	}
	public static void main(String[] args) {

	}
}
