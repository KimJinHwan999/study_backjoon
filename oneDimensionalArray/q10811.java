package oneDimensionalArray;

import java.util.Scanner;

public class q10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];

        for(int i = 0; i < N; i++){
            basket[i] = i + 1;
        }
        
        for(int cnt = 0; cnt < M; cnt++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp = 0;
            int tmp2 = 0;

            int[] basket_ = new int[j - i + 1];

            for(int k = 0; k < j - i + 1; k++){
                basket_[k] = basket[j - 1 - tmp];
                tmp++;
            }

            for(int l = i - 1; l < j; l++){
                basket[l] = basket_[tmp2];
                tmp2++;
            }
        }

        for(int x = 0; x < N; x++){
            System.out.print(basket[x] + " ");
        }
    }
}
