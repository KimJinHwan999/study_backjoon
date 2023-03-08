package string;

import java.util.Scanner;

public class q9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        String[] words = new String[T];

        for(int i = 0; i < T; i++){
            String word = sc.next();
            words[i] = word;
        }

        for(int i = 0; i < T; i++){
            System.out.print(words[i].charAt(0));
            System.out.print(words[i].charAt(words[i].length() - 1));
            System.out.println();
        }
    }
}

// next() 와 nextLine()의 차이
/*
next() 메소드는 스페이스(공백) 를 치기 전 까지 쓴 문자열을 모두 반환한다.
nextLine() 메소드는 엔터를 치기 전 까지 쓴 문자열을 모두 반환한다.
*/