import java.util.Scanner;

public class No_1978 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int prime = sc.nextInt();
			if(isPrime(prime)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
