import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int j = 0;
		int c = Integer.parseInt(br.readLine());
		long x, y, n, k, count;
		No_1011 a = new No_1011();
		while (j < c) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if(y-x == 1) {
				System.out.println("1");
				j++;
				continue;
			}else if(y-x == 0) {
				System.out.println("0");
				j++;
				continue;
			}

			n = a.findN(x, y);
			k = y - x - n * (n + 1);
			count = n * 2;

			if (k == 0) {
				count = count + 0;
			} else if (k <= n + 1) {
				count = count + 1;
			} else {
				count = count + 2;
			}
			System.out.println(count);
			j++;
		}
	}

	public long findN(long x, long y) {
		long i = 1;
		while (true) {
			if ((i + 1) * (i + 2) > y - x) {
				break;
			}
			i++;
		}
		return i;
	}
}
