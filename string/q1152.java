package string;

import java.util.Scanner;

public class q1152{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().trim();
        String[] wordArr = word.split(" ");

        if(word.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(wordArr.length);
        }
    }
}