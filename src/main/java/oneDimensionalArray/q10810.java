package oneDimensionalArray;

import java.util.Scanner;

public class q10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int i, j, k = 0;


        int[] basket = new int[N];

        for(int a = 1; a <= N; a++){
            basket[a-1] = 0;  
        }

        for(int b = 0; b < M; b++){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();

            for(int c = i-1; c <= j-1; c++){
                basket[c] = k;
            }
        }

        for(int d = 0; d < N; d++){
            System.out.print(basket[d] + " ");
        }

    }
}
