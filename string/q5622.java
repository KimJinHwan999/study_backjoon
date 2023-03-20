package string;

import java.util.Scanner;

public class q5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alphabet = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String phoneNum = sc.next();
        int[] num = new int[phoneNum.length()];
        int answer = 0;

        for(int i = 0; i < phoneNum.length(); i++){
            for(int j = 0; j < 8; j++){
                for(int k = 0; k < alphabet[j].length(); k++){
                    if(phoneNum.charAt(i) == alphabet[j].charAt(k)){
                        num[i] = j + 3;
                    };
                }
            }
        }

        for(int i = 0; i < num.length; i++){
            answer += num[i];
        }

        System.out.println(answer);
    }
}
