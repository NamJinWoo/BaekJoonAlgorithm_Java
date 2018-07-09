import java.util.Scanner;

public class No_10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int second = 0;
		
		if(x <= y && x >= z) {
			second = x;
		}
		else if (x <= z && x >= y ) {
			second = x;
		}
		else if(y <= x && y >= z) {
			second = y;
		}
		else if (y <= z && y >= x ) {
			second = y;
		}
		else if(z <= y && z >= x) {
			second = z;
		}
		else if (z <= x && z >= y ) {
			second = z;
		}
		System.out.println(second);
	}
}
