import java.util.Scanner;

public class No_1110 {
	int count = 0;
	int sum = 0;

	public int getNewNumber(int oldNum) {
		count++;
		if (oldNum < 10) {
			sum = oldNum;
		} else {
			int a = oldNum / 10;
			int b = oldNum % 10;
			sum = a + b;
		}

		if (sum >= 10) {
			return (oldNum % 10) * 10 + (sum % 10);
		} else {
			return (oldNum % 10) * 10 + sum;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		No_1110 a = new No_1110();
		int newNum = num;
		while (true) {
			newNum = a.getNewNumber(newNum);
			if (num == newNum) {
				System.out.println(a.count);
				break;
			}
		}
	}
	// public String getNewNumber(String oldNum) {
	// if (oldNum.length() != 2) {
	// oldNum = "0" + oldNum;
	// } // 한자리 수이면 0을 합침.
	// count++;
	// int a = Character.getNumericValue(oldNum.charAt(0)); // 십의 자리를 int로 변환
	// int b = Character.getNumericValue(oldNum.charAt(1));
	// int sum = a + b;
	// String sum1 = Integer.toString(sum);
	// if (sum1.length() == 2) {
	// sum1 = Character.toString(sum1.charAt(1));
	// }
	// String newNum = Character.toString(oldNum.charAt(1)) + sum1;
	// return newNum;
	// }
	//
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// String num = sc.next();
	// No_1110 a = new No_1110();
	// String newNum = num;
	// while (true) {
	// newNum = a.getNewNumber(newNum);
	// if (num.equals(newNum)) {
	// System.out.println(a.count);
	// break;
	// }
	// }
	// }
}
