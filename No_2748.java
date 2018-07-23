import java.util.Scanner;

public class No_2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n + 1];

		list[0] = 0; 
		list[1] = 1;

		for (int i = 2; i < list.length; i++) {
			list[i] = list[i - 2] + list[i - 1];
		}
		System.out.println(list[n]);
	}

}
