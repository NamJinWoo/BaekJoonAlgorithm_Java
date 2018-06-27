import java.util.Scanner;

public class No_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = x; i > 0; i--) {
			for (int j = 0; j < x; j++) {
				if(j>=i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
