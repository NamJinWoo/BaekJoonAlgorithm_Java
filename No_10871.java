import java.util.Scanner;

public class No_10871 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int mlength = sc.nextInt(); //수열의 길이
		 int num = sc.nextInt();
		 
		 int[] newarr = new int[mlength];
		 
		 int j = 0;
		 while(j<newarr.length) {
			 newarr[j] = sc.nextInt();
			 j++;
		 }
		 
		 for(int i = 0; i < newarr.length; i++) {
			 if(num > newarr[i]) {
				 System.out.print(newarr[i]+" ");
			 }
		 }
	}
}
