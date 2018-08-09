
import java.util.Scanner;

public class No_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		for(int i = 0; i<num; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		int sum, score;
		for(int j = 0 ; j< arr.length; j++) {
			sum = 0;
			score = 0;
			for(int k=0;k< arr[j].length();k++) {
				if(arr[j].charAt(k) == 'O') {
					sum += ++score;
				}else {
					score = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
