import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int j = 0;
		int c = Integer.parseInt(br.readLine());
		int x, y, n, sum, k, count;
		No_1011 a = new No_1011();
		while (j < c) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			n = a.findN(x, y);
			sum = n * (n + 1) / 2;
			k = y - x - sum * 2;
			count = n * 2;

			if (k == 0) {
				count = count + 0;
			} else if (k <= n + 1 && k > 0) {
				count = count + 1;
			} else {
				count = count + 2;
			}
			bw.write(count + "\n");
			j++;
		}
		bw.close();
	}

	public int findN(int x, int y) {
		int i = 1;
		while (true) {
			if ((i + 1) * (i + 2) > y - x) {
				break;
			}
			i++;
		}
		return i;
	}
}
