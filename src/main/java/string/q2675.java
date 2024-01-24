package string;

import java.util.Scanner;

public class q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // 테스트 케이스 개수
        String[] P = new String[T];

        for(int i = 0; i < T; i++){
            P[i] = "";
        }

        for(int i = 0; i < T; i++){
            int R = sc.nextInt();   // 반복 횟수
            String S = sc.next();

            for(int j = 0; j < S.length(); j++){
                char ch = S.charAt(j);

                for(int k = 0; k < R; k++){
                    P[i] += ch;
                }
            }
        }

        for(int i = 0; i < T; i++){
            System.out.println(P[i]);
        }
    }
}
