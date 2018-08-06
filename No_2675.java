import java.util.Scanner;

public class No_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i =0;
		int[] arr1 = new int[num];
		String[] arr2 = new String[num];
		while(i < num) {
			arr1[i] = sc.nextInt();
			arr2[i] = sc.next();
			i++;
		}
		for(int j = 0; j < num; j++) {
			for(int k = 0; k<arr2[j].length();k++) {
				for(int m = 0; m<arr1[j]; m++) {
					System.out.print(arr2[j].charAt(k));
				}
			}
			System.out.println();
		}
	}
}
