
public class Kakao_1 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 10, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		String[] result = new String[n];
		
		for(int i = 0; i< n; i++) {
			int arr= arr1[i] | arr2[i];
			System.out.println("" + Integer.toBinaryString(arr));
		}
		System.out.println("");
		
		for(int i =0; i<n; i++) {
			String resultString = "";
			int arr= arr1[i] | arr2[i]; // 오어 연산을 한다.
			int targetBit=1; //비트 앤드연산과 비트 쉬프트를 위해서 설정한다.
			for(int j = 0; j< n; j++) {
				resultString = ((arr & targetBit) > 0 ? "#" : " ") + resultString;  //조건문을 만들어준다.
				targetBit = targetBit << 1; //타겟 비트를 쉬프트한다.
			}
			result[i] = resultString;
			System.out.println(result[i]);
		}
		
	}
}
