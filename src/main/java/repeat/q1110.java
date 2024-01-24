package repeat;
import java.util.Scanner;

public class q1110{
    public static void main(String[] args) {
        // 주어진 수가 10보다 작다면 0을 붙여 앞에 0을 붙여 두 자리 수로 만들고 각 자리 숫자 더한다 (9 -> 09 -> 0+9)
        // 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙여 새로운 수를 만든다. (09 -> 9 9 -> 9 = 99)
        // (26 -> 2+6 = 8 => 68 / 68 -> 6 + 8 = 14 => 84 / 84 -> 8 + 4 = 12 => 42 / 42 -> 4 + 2 = 6) 사이클 : 4
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = N / 10; 
        int O = N % 10;
        int P = M + O; 
        int Q = 10 * O + P % 10;
        int i = 1;
        sc.close();

        if(N >= 0 || N <= 99){
            int N_;
            while(Q != N){
                N_ = Q;
                M = N_ / 10;
                O = N_ % 10;
                P = M + O;
                Q = 10 * O + P % 10;
                i++;
            }
        }
        System.out.println(i);
    }
}


