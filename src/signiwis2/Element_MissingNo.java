package signiwis2;
import java.util.ArrayList;
public class Element_MissingNo {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6, 9, 8, 10 };
		int N = 10;

		ArrayList<Integer> missingNum = findMissingNumbers(arr, N);

		System.out.println("Missing numbers:");
		for (int num : missingNum) {
			System.out.print(num+" ");
		}
	}
	
	public static ArrayList<Integer> findMissingNumbers(int[] arr, int N) {
		boolean marked[] = new boolean[N];

		for (int num : arr) {
			marked[num - 1] = true;
		}

		ArrayList<Integer> missingNum = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (!marked[i]) {
				missingNum.add(i + 1);
			}
		}
		return missingNum;
	}
}
