import java.util.Scanner;

public class No_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String y = sc.next();
		int sum = 0;
		
		for(int i = 0; i < x ; i++) {
			sum += Character.getNumericValue(y.charAt(i));
		}
		System.out.println(sum);
		sc.close();
	}
}
