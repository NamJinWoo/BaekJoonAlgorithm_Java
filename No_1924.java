import java.util.Scanner;

public class No_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		int day;
		int total = 0;
		
		for (int i = 1; i < x; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				day = 31;
				total += day;
			}
			else if ( i == 2) {
				day = 28;
				total += day;
			}
			else {
				day = 30;
				total += day;
			}
		}
		
		total += y;
		
		if( ( total % 7 ) == 1) {
			System.out.println("MON");
		}
		else if( ( total % 7 ) == 2) {
			System.out.println("TUE");
		}
		else if( ( total % 7 ) == 3) {
			System.out.println("WED");
		}
		else if( ( total % 7 ) == 4) {
			System.out.println("THU");
		}
		else if( ( total % 7 ) == 5) {
			System.out.println("FRI");
		}
		else if( ( total % 7 ) == 6) {
			System.out.println("SAT");
		}
		else {
			System.out.println("SUN");
		}
		
	}
}
