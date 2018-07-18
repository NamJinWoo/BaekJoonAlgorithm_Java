import java.util.Scanner;

public class No_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, m;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		m = a * b * c;
		String mString = Integer.toString(m);
		int k = 0;

		while (k < 10) {
			int count =0;
			for (int i = 0; i < mString.length(); i++) {
				if (Character.getNumericValue(mString.charAt(i)) == k) {
					count++;
				}
			}
			System.out.println(count);
			k++;
		}
	}
}
