import java.util.Scanner;

public class No_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		for (int i = 97; i <= 122; i++) {
			int num = -1;
			for(int j = 0; j<x.length(); j++) {
				if(Character.toString(x.charAt(j)).equals(Character.toString((char)i))) {
					num = j;
					break;
				}
			}
			System.out.print(num+" ");
		}
	}
}
