package string;

import java.util.Scanner;

public class q11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        System.out.println((int)ch);
    }
}

// charAt(n) 메서드
// String 타입의 데이터에서 특정 문자를 char타입으로 변환할 때 사용하는 메서드
// n 자리에 들어가는 인덱스의 글자를 가져올 수 있음