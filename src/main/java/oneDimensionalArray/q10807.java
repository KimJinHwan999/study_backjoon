package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(v == num){
                count++;
            }

        }

        br.close();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
