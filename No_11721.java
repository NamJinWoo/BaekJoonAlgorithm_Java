import java.util.Scanner;

public class No_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x= sc.next();
		
		for(int i = 0; i< x.length(); i++) {
			if( ( i % 10 ) == 0 && i != 0) {
				System.out.println("");
			}
			System.out.print(x.charAt(i));
		}
	}
}
