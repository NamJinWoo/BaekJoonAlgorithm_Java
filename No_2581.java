import java.util.Scanner;

public class No_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minR = sc.nextInt();
		int maxR = sc.nextInt();
		int sum = 0;
		int index = 0;
		int minN = 0;

		for (int i = minR; i <= maxR; i++) {
			if (isPrime(i)) {
				index++;
				if (index == 1) {
					minN = i;
				}
				sum += i;
			}
		}
		if (index == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(minN);
		}

	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
