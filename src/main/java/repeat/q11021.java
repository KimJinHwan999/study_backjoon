package repeat;
import java.util.Scanner;

public class q11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() + sc.nextInt();
        }
        
        for(int j = 0; j < arr.length; j++){
            System.out.println("Case #" + (j+1) + ": " + arr[j]);
        }
        sc.close();
    }
}
// 1.
// 자료형[] 변수 = {데이터1, 데이터2, 데이터3... };

// 2.
// 자료형[] 변수 = new 자료형[배열 크기];
// 변수[0] = 데이터값;
// 변수[0] = 데이터값;