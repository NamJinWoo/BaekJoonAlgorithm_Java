import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1152 {
	public static void main(String[] args) {
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader로 읽은 후에 
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//한줄을 토크나이즈 한다.
			while(st.hasMoreTokens()) { //더이상 토큰이 없을때까지돌리면
				st.nextToken(); //다음으로 넘어간다.
				count++;
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
