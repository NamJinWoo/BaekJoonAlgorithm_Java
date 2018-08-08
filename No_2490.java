import java.util.Scanner;
import java.util.StringTokenizer;

public class No_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] arr = new int[3];
		while (i < 3) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int sum = 0;

			for (int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			arr[i] = sum;
			i++;
		}
		for (int k = 0; k < 3; k++) {
			if (arr[k] == 1) {
				System.out.println("C");
			} else if (arr[k] == 2) {
				System.out.println("B");
			} else if (arr[k] == 3) {
				System.out.println("A");
			} else if (arr[k] == 4) {
				System.out.println("E");
			} else {
				System.out.println("D");
			}
		}
	}
}
