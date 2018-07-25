
public class No_4673 {
	public static void main(String[] args) {
		boolean[] isNotSelf = new boolean[10001];//boolean은 기본으로 false인것을 이용한다.
		for (int i = 1; i <= 10000; i++) {
            int num = getNumber(i);
            if (num <= 10000) {
                isNotSelf[num] = true;             
            }
        }
         
        for (int i = 1; i < isNotSelf.length; i++) {
            if (!isNotSelf[i]) {
                System.out.println(i);              
            }
        }
        
	}
	private static int getNumber(int num) {
		int newNum = num;
		while(num > 0) {
			newNum += num%10;
			num /= 10;
		}
		return newNum;
	}
}
