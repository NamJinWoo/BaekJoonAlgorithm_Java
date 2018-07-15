import java.util.Scanner;

public class No_2448 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int line = sc.nextInt(); //줄수 입력하는데, 3*2^k승이어야한다.
        int k = (int) (Math.log(line / 3) / Math.log(2)) + 1;
        String[] arr = new String[line];
        
        arr[0] = "  *  ";
        arr[1] = " * * ";
        arr[2] = "*****";
        /*
         * 첫 3줄은 강제로 입력한다
         * */
        int copy = 3; //첫 세줄로 초기값을 설정하고, 그 다음에 이것을 이용해 두배하면서 for문을 돌린다.

        for(int i = 1 ; i < k ; i++) {
            for(int j = 0 ; j < copy ; j++) {
                arr[copy + j] = arr[j] + " " + arr[j];
                //앞 뒤에 써준다. 중간에는 띄어쓰기.
                for(int m = 0 ; m < copy / 3 ; m++) {
                    arr[j] = "   " + arr[j] + "   ";
                }//복사한 것들을 제외 앞에 있는것들은 3칸씩 띄어쓰기를 양옆에 추가해준다.
            }
            copy = copy *2;
        }
        
        for(int i = 0 ; i < copy ; i++) {
            System.out.println(arr[i]);
        } //배열 전체를 프린트 한다.
    }
}