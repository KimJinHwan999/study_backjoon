package string;

import java.util.Scanner;

public class q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] cnt = new int[S.length()];
        int[] answer = new int[26];

        for(int i = 0; i < 26; i++){
            answer[i] = -1;
        }

        for(int i = 0; i < S.length(); i++){
            int j = 0;
            while(cnt[i] != -1){
                if(S.charAt(i) != alphabet.charAt(j)){
                    j++;
                }

                if(S.charAt(i) == alphabet.charAt(j)){
                    cnt[i] = j;
                    break;
                }

            }
            // for(int j = 0; j < 26; j++){
            //     if(S.charAt(i) == alphabet.charAt(j)){
            //         cnt[i] = j;
            //     }

            // }
        }

        for(int i = 0; i < S.length(); i++){
            answer[cnt[i]] = i;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(answer[i] + " ");
        }

    }    
}
