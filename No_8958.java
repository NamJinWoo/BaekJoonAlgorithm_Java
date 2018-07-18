import java.util.Scanner;

public class No_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		String[] arr = new String[num];
		while (i < num) {
			String result = sc.next();
			arr[i] = result;
			i++;
		}

		
		int k;
		for (k = 0; k < arr.length; k++) {
			int score = 1, sum = 0;
			for (int j = 0; j < arr[k].length(); j++) {
				if (arr[k].charAt(j) == 'O') {
					sum += score;
					if (j != 9) {
						if (arr[k].charAt(j + 1) == 'O') {
							score++;
						} else {
							score = 1;
						}
					}
				}
			}

			System.out.println(sum);
		}

	}
}
