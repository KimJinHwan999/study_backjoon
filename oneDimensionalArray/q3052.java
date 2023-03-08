package oneDimensionalArray;

import java.util.Scanner;

public class q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] remainder = new int[10];
        int cnt = 0;
        

        for(int i = 0; i < 10; i++){
            int N = sc.nextInt();
            int ans = N % 42;
            remainder[i] = ans;
        }

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){
                
                if(i == j){
                    break;
                }

                if(remainder[i] == remainder[j]){
                    cnt++;
                    j = 10;
                }
            }
        }

        System.out.println(10 - cnt);
    }
}
