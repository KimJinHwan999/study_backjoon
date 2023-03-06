package oneDimensionalArray;

import java.util.Scanner;

public class q10813 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 바구니 갯수
        int M = sc.nextInt();   // 바꾸는 횟수
        int tmp = 0;

        int[] basket = new int[N];

        for(int cnt = 0; cnt < N; cnt++){   // 기존 바구니에 들어있는 공 초기값
            basket[cnt] = cnt + 1;
        }

        for(int cnt = 0; cnt < M; cnt++){   // 사용자가 입력한 번호의 바구니에서 공 바꿔주기
            int i = sc.nextInt();
            int j = sc.nextInt();

            tmp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = tmp;
        }

        for(int cnt = 0; cnt < N; cnt++){   // 바구니에서 순서대로 공 빼주기
            System.out.print(basket[cnt] + " ");
        }
   } 
}
