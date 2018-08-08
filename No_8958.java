import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int i = 0;
		String[] arr = new String[num];
		while (i < num) {
			arr[i] = br.readLine();
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

			bw.write(sum+"\n");
		}
		bw.close();
	}
}
