import java.util.Scanner;

public class No_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1, x = 0;

		while (true) {
			if ((n + 1) * n >= num * 2) {
				break;
			}
			n++;
		}
		x = num - ((n - 1) * n) / 2;
		if (n % 2 == 1) { // 홀수일때
			System.out.println(n - (x - 1) + "/" + x);
		} else {
			System.out.println(x + "/" + (n-(x - 1)));
		}

	}
}
