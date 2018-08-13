import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No_1475 {
	public static void main(String[] args) {
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i = 0; i<10; i++) {
			m.put(i,0);
		} //시작하기전에 맵을 만든다.
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		for(int i = 0; i< num.length(); i++) {
					m.put(Character.getNumericValue(num.charAt(i)), m.get(Character.getNumericValue(num.charAt(i)))+1);
		}
		int max = 0;
		for(int x = 0 ; x<6; x++) {
			if(m.get(x) > max) {
				max = m.get(x);
			}
		}
		for(int x = 7 ; x<9; x++) {
			if(m.get(x) > max) {
				max = m.get(x);
			}
		}
		if((m.get(6)+m.get(9)+1)/2 > max) {
			max = (m.get(6)+m.get(9)+1)/2;
		}
		System.out.println(max);
	}
}
