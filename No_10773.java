import java.util.ArrayList;
import java.util.Scanner;

public class No_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_line = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i< total_line; i++) {
			int number = sc.nextInt();
			if(number == 0) {
				array.remove(array.size()-1);
			}
			else{
				array.add(number);
			}
		}
		
		int total_sum = 0;
		for(int j=0; j<array.size(); j++) {
			total_sum += array.get(j);
		}
		System.out.println(total_sum);
	}
}
