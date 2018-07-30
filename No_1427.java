import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No_1427 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		int[] arr= new int[num.length()];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = Character.getNumericValue(num.charAt(i));
		}
		Arrays.sort(arr);
		for(int j = arr.length-1; j>=0; j--) {
			bw.write(arr[j]+"");
		}
		bw.close();
	}
}
