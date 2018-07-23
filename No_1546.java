import java.util.Arrays;
import java.util.Scanner;

public class No_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		float[] arr = new float[num];
		int i = 0;
		while (i < num) {
			arr[i] = sc.nextInt();
			i++;
		}

		Arrays.sort(arr);
		float max = (int)arr[arr.length - 1];

		for (int j = 0; j < arr.length; j++) {
			arr[j] = (float)(arr[j]/max)*100;
		}
		float sum =0;
		for(int k = 0; k<arr.length; k++) {
			sum += arr[k];
		}
		float avg = sum/num;
		String str = String.format("%.2f", avg);

		System.out.println(str);
	}
}
