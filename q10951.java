import java.util.Scanner;

public class q10951{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNextInt() ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }
}

// sc.hasNextInt() : 입력값이 int일 때만 true를 반환
// 입력값이 들어올 떄 까지 while 문 내부가 실행되지 않다가 true 를 리턴한 이후에 while문 내부가 실행됨