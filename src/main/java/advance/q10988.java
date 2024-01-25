package advance;

import java.util.Scanner;

public class q10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word_ = sc.nextLine();
		String word = word_.toLowerCase();
		
		int len = word.length();
		int half = len / 2;
		int remain = len % 2;
		
		int rtn = 1;
		
		// 단어의 길이가 대칭이 아닐 때 가운데 글자 삭제
		if(remain == 1) {
			word = word.substring(0, half) + word.substring(half+1);
		}	
		
		String hWord = word.substring(0, half);
		String tWord = word.substring(half);
		
		for(int i = 0; i < half; i++) {
			if(hWord.charAt(i) != tWord.charAt(half - 1 - i)) {
				rtn = 0;
				break;
			}
		}
		System.out.println(rtn);
	}
}
