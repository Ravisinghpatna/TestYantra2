package signiwis2;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapWithoutDuplicates {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ravi", 27);
		map.put("Raushan", 30);
		map.put("Santosh", 31);
		map.put("Sumit", 25);
		map.put("Amitt", 25);

		HashSet<Integer> set = new HashSet<>(map.values()); // Create a HashSet of the values to remove duplicates
		for (Integer value : set) {
			for (String key : map.keySet()) {
				if (map.get(key).equals(value)) { // If the value matches, print the key
					System.out.println(key + " " + value);
					break;
				}
			}
		}
	}
}



