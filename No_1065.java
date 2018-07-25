import java.util.Scanner;

public class No_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;

		if (num < 100) {
			System.out.println(num);
			return;
		}

		count = 99;

		for (int i = 100; i <= num; i++) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;

			if (a - b == b - c) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
