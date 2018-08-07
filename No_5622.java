import java.util.Scanner;

public class No_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String call = sc.nextLine();
		int sum = 0;
		int[] arr = new int[call.length()];
		for (int i = 0; i < call.length(); i++) {
			if (call.charAt(i) == 'A' || call.charAt(i) == 'B' || call.charAt(i) == 'C') {
				arr[i] = 2;
			} else if (call.charAt(i) == 'D' || call.charAt(i) == 'E' || call.charAt(i) == 'F') {
				arr[i] = 3;
			} else if (call.charAt(i) == 'G' || call.charAt(i) == 'H' || call.charAt(i) == 'I') {
				arr[i] = 4;
			} else if (call.charAt(i) == 'J' || call.charAt(i) == 'K' || call.charAt(i) == 'L') {
				arr[i] = 5;
			} else if (call.charAt(i) == 'M' || call.charAt(i) == 'N' || call.charAt(i) == 'O') {
				arr[i] = 6;
			} else if (call.charAt(i) == 'P' || call.charAt(i) == 'Q' || call.charAt(i) == 'R'
					|| call.charAt(i) == 'S') {
				arr[i] = 7;
			} else if (call.charAt(i) == 'T' || call.charAt(i) == 'U' || call.charAt(i) == 'V') {
				arr[i] = 8;
			} else if (call.charAt(i) == 'W' || call.charAt(i) == 'X' || call.charAt(i) == 'Y'
					|| call.charAt(i) == 'Z') {
				arr[i] = 9;
			}
		}
		for(int j = 0; j<call.length(); j++) {
			sum += arr[j];
		}
		System.out.println(sum + call.length());

	}
}
