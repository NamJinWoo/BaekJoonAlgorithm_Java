import java.util.Scanner;

public class No_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float num = sc.nextInt();
		int i = 0;
		while (i < num) {
			float sum = 0;
			int x = sc.nextInt();
			float[] newarr = new float[x];
			for (int j = 0; j < x; j++) {
				
				newarr[j] = sc.nextInt();
				sum += newarr[j];
				
			}

			float avg = sum / x;
			float count = 0;
			for (int m = 0; m < newarr.length; m++) {
				if( newarr[m] > avg) {
					count++;
				}
			}
			float f = count * 100 / x;
			String str = String.format("%.3f", f);
			System.out.println( str +"%");
			i++;
		}
	}
	//아직 미완성.
}
