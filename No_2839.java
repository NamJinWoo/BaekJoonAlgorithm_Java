import java.util.Scanner;

public class No_2839 {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int five = 0;
	        int three = 0;
	        
	        
	        while(x%5!=0&&x>=0){
	            x-=3;
	            three++;
	        }
	        if(x<0){
	            System.out.println(-1);
	        }
	        else{
	            five = x/5;
	            System.out.println(five+three);        
	        }
	    
	    }
}
