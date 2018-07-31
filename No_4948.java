import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> newArray = new ArrayList<Integer>();
		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			int count = 0;
			for (int i = num+1; i <= num * 2; i++) {
				if (isPrime(i)) {
					count++;
				}
			}
			newArray.add(count);
		}
		for(int j = 0; j < newArray.size(); j++) {
			System.out.println(newArray.get(j));
		}
		sc.close();
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
