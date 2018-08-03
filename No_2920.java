import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[st.countTokens()];
		int i = 0;

		while (st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		boolean isAscending = false;
		boolean isDescending = false;
		boolean isMixed = false;
		for (int j = 1; j < arr.length - 1; j++) {
			if (arr[j] - arr[j - 1] == arr[j + 1] - arr[j]) {
				if (arr[j] - arr[j - 1] > 0) {
					isAscending = true;
					isDescending = false;
					isMixed = false;
				}
				else {
					isAscending = false;
					isDescending = true;
					isMixed = false;
				}
			}
			else {
				isAscending = false;
				isDescending = false;
				isMixed = true;
				break;
			}
		}
		if(isAscending) {
			bw.write("ascending");
		}else if(isDescending) {
			bw.write("descending");
		}
		else {
			bw.write("mixed");
		}
		bw.close();
	}
}
