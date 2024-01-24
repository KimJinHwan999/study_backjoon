package advance;

import java.util.Scanner;

public class q2444 {
	public static void main(String[] args) {
		/*
    	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

    	입력
    	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

    	출력
    	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

    	예제 입력 1 
    	5

    	예제 출력 1 
    	    *
    	   ***
    	  *****
    	 *******
    	*********
    	 *******
    	  *****
    	   ***
    	    *
    	*/

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = 2 * N - 1;
        int quotient = M / 2;
        int k = 1;
        
        String star = "*";
        String blank = " ";
        
        for(int i = 1; i < quotient + 2; i++) {
        	String str = "";
        	str = blank.repeat(quotient + 1 - i) + str;
        	str = str + star.repeat(2*i - 1);
        	System.out.println(str);
        }
        for(int j = quotient; j > 0; j--) {
        	String str1 = "";
        	str1 = blank.repeat(k) + str1;
        	str1 = str1 + star.repeat(2*j - 1);
        	System.out.println(str1);
        	k++;
        }
        
	}
}
