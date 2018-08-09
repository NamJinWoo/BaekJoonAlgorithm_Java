import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();

		Map<String, Integer> table = new HashMap<String, Integer>();
		for (int i = 0; i < test.length(); i++) {
			if (table.containsKey(Character.toString(test.charAt(i)).toUpperCase())) {
				table.put(Character.toString(test.charAt(i)).toUpperCase(),
						table.get(Character.toString(test.charAt(i)).toUpperCase()) + 1);
			} else
				table.put(Character.toString(test.charAt(i)).toUpperCase(), 1);
		}
		if (table.size() == 1) {
			for (String o : table.keySet()) {
		//		if (table.get(o).equals(test.length())) {
					System.out.println(o);
		//		}
			}
		} else {
			Object[] arr = table.values().toArray();
			Arrays.sort(arr);

			if (arr[table.size() - 1].equals(arr[table.size() - 2])) {
				System.out.println("?");
			} else {
				for (String o : table.keySet()) {
					if (table.get(o).equals(arr[table.size() - 1])) {
						System.out.println(o);
					}
				}
			}
		}
	}
}
