package string;

import java.util.Scanner;

public class q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] aArr = new String[2];

        for(int i = 0; i < 2; i++){
            String A = sc.next();
            char tmp;
            char a = A.charAt(0);
            char b = A.charAt(2);

            tmp = a;
            a = b;
            b = tmp;

            char[] charArr = {a, A.charAt(1), b};
            String A_ = new String(charArr);

            aArr[i] = A_;
        }

        if(Integer.parseInt(aArr[0]) > Integer.parseInt(aArr[1])){
            System.out.println(aArr[0]);
        }else{
            System.out.println(aArr[1]);
        }

    }
}
