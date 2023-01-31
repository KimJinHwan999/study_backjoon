package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q10871 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st_ = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[X - 1];
        int count = 0;

        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(st_.nextToken());
            if(A < X){
                arr[count] = A;
                count++; 
            }
        }
        
        br.close();

        for(int i = 0; i < X - 1; i++){
            bw.write(String.valueOf(arr[i]));
        }
        
        bw.flush();
        bw.close();
    }
}
