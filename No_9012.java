import java.util.*;

public class No_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_row = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < total_row; i++) {
			int left_brace_count = 1;
			String line = sc.next();
			if (line.charAt(0) != ')') {
				for (int j = 1; j < line.length(); j++) {

					if (line.charAt(j) == '(') {

						left_brace_count += 1;

					} else {

						left_brace_count -= 1;
						if (left_brace_count < 0) {
							break;
						}

					}
				}
			}
			array.add(left_brace_count);

		}

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) != 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
