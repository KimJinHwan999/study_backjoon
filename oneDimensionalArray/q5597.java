package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q5597 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int tmp;
    int totalStudent = 30;
    int submitStudent = 28;
    int[] totalArr = new int[totalStudent];
    int[] submitArr = new int[submitStudent];

    for(int i = 0; i < submitStudent; i++){
        submitArr[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0; i < submitStudent; i++){
        for(int j = 1; j <= submitStudent; j++){
            if(submitArr[i] > submitArr[j]){
                tmp = submitArr[i];
                submitArr[i] = submitArr[j];
                submitArr[j] = tmp;
            }
        }
    }

    bw.write(String.valueOf(submitArr));
    bw.flush();
    bw.close();

  }  
}
