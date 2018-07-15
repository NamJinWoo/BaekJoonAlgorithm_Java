import java.util.Scanner;

public class No_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		while (i < num) {
			int x = sc.nextInt();
			int[] newarr = new int[x];
			for (int j = 0; j < x; j++) {
				
				newarr[j] = sc.nextInt();
				sum += newarr[j];
				
			}

			int avg = sum / x;
			int count = 0;
			for (int m = 0; m < newarr.length; m++) {
				if( newarr[m] > avg) {
					count++;
				}
			}
			System.out.println((double)(count * 100 / x) );
			i++;
		}
	}
}
