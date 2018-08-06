import java.util.Scanner;

public class No_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while(i<5) {
			int num = sc.nextInt();
			if(num < 40) {
				sum +=40;
			}else {
				sum += num;
			} 
			i++;
		}
		System.out.println(sum/5);
	}
}
