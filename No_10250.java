import java.util.Scanner;

public class No_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		sc.nextLine();
		String[] inputArray = new String[inputNumber];
		for (int i = 0; i < inputNumber; i++) {
			inputArray[i] = sc.nextLine();
			System.out.println( i + ": " + inputArray[i]);
		}
		// 여기까지 받음.
		for (int j = 0; j < inputArray.length; j++) {
			System.out.println(inputArray[j].split(" ").length+ "!!!");
			int ho = Integer.parseInt(inputArray[j].split(" ")[2]) / Integer.parseInt(inputArray[j].split(" ")[0]);
			int dong = Integer.parseInt(inputArray[j].split(" ")[2]) % Integer.parseInt(inputArray[j].split(" ")[0]);
			String room = String.valueOf(ho) + String.valueOf(dong);
			System.out.println(room);
		}
	}
}
