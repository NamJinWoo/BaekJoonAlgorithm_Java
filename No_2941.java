import java.util.Scanner;

public class No_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word= sc.next();
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int k = 0; k<word.length()-2;k++) {
			if(word.substring(k, k+3).equals(arr[2])) {
				word = word.replaceFirst(arr[2], "!");
			}
		}
		String newWord= null;
		for(int i = 0; i< word.length()-1; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(word.substring(i, i+2).equals(arr[j])) {
					word = word.replaceFirst(arr[j], "!");
					break;
				}
			}
		}
		System.out.println(word.length());
	}
}