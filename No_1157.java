import java.util.Scanner;

public class No_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		test = test.toLowerCase();
		int[] x = new int[26];

		for (int i = 0; i < test.length(); i++) {
			x[(int) (test.charAt(i) - 'a')]++;
		}
		int first = x[0];
		int second = 0;
		int firstIndex = 0;
		for (int i = 1; i < x.length; i++) {
			if (first <= x[i]) {
				second = first;
				first = x[i];
				firstIndex = i;
			}
		}

		if (first == second) {
			System.out.println("?");
		} else {
			System.out.println((Character.toString((char) (firstIndex + 'a'))).toString().toUpperCase());
		}
	}
}
