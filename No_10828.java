import java.util.ArrayList;
import java.util.Scanner;

public class No_10828 {
	public static void main(String[] args) {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < number; i++) {
			String line = sc.nextLine();
			if( line.contains("push")) {
				stack.add(Integer.parseInt(line.split(" ")[1]));
			}
			else if(line.contains("pop")) {
				if(stack.size()==0) {
					System.out.println("-1");
					continue;
				}
				System.out.println(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
			}
			else if(line.contains("size")) {
				System.out.println(stack.size());
			}
			else if(line.contains("empty")) {
				if(stack.size()==0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if(line.contains("top")) {
				if(stack.size()==0) {
					System.out.println("-1");
					continue;
				}
				System.out.println(stack.get(stack.size()-1));
			}
		}
	}
}
