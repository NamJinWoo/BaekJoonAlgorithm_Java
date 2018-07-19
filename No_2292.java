import java.util.Scanner;

public class No_2292 {
	int n = 0;
	int y = 2 + (6 * n);
	public void findAnswer(int x) {
		
		if (x >= y) {
			n++;
			y = y + ( 6 * n );
			findAnswer(x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		No_2292 a = new No_2292();
		if (num == 1) {
			System.out.println("1");
		}else {
			a.findAnswer(num);
			System.out.println(a.n+1);
		}
	}
}
