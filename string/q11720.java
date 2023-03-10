package string;

import java.util.Scanner;

public class q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        String totalNumber = sc.next();

        for(int i = 0; i < N; i++){
            char number = totalNumber.charAt(i);
            int intNumber = Character.getNumericValue(number);
            sum += intNumber;
        }
        
        System.out.println(sum);
    }
}

// char를 int로 형변환
/*
 * 1. 0을 빼주기 (아스키코드에서 48인 0을 빼주어 원래 숫자로 표기)
 * 2. Character.getNumericValue() 함수 사용
 */
