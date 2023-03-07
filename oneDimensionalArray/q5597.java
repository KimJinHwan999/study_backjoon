package oneDimensionalArray;

import java.util.Scanner;

public class q5597 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] students = new int[30];

    for(int i = 0; i < 30; i++){
      students[i] = 0;
    }

    for(int j = 0; j < 28; j++){
      int n = sc.nextInt();
      students[n-1] = n;
    }

    for(int k = 0; k < 30; k++){
      if(students[k] == 0){
        System.out.println(k+1);
      }
    }
  }
}  

