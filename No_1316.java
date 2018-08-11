import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = num;

		for (int i = 0; i < num; i++) {
			String x = sc.next();
			boolean[] checker = new boolean[26];// boolean배열의 기본값은 false임

			for (int j = 1; j < x.length(); j++) {
				if (x.charAt(j - 1) != x.charAt(j)) {
					if (checker[x.charAt(j) - 97] == true) {
						count--;
						break;
					}
					checker[x.charAt(j - 1) - 97] = true;
				}
			}
		}
		
		System.out.println(count);
	}
}
