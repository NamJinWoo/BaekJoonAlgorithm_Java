import java.util.*;

public class No_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int i = 0;
		while(i<num) {
			arr[i] = sc.nextInt();
			i++;
		}
		Arrays.sort(arr);
		for(int j = 0; j< arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
