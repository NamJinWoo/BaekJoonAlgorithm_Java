import java.util.Scanner;

public class No_1003 {
	static int zero;
	static int one;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] arr = new int[41][2];
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		for (int i = 2; i < 41; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = arr[i - 2][j] + arr[i - 1][j];
			}
		}
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			System.out.println(arr[y][0] + " " + arr[y][1]);
		}

	}
}
