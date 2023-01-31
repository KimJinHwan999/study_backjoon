package repeat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());    // 받는 숫자 갯수
        StringTokenizer st = null; // 더해줄 숫자
        int[] arr = new int[T];

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = a + b;
        }
        
        for(int j = 0; j < T; j++){
            bw.write(String.valueOf(arr[j]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

// Buffer InputStream 과 InputStreamReader 를 보완하고 합쳐서 탄생한 입출력의 최종형태
// 버퍼는 입력받은 값은 버퍼에 저장해두었다가 버퍼가 가득차거나 개행 문자가 나타나면 버퍼의 내용을 한 번에 전송하게 된다
// 주의사항
// 1. 엔터를 통해 데이터를 출력하기 때문에, 띄어쓰기를 하려면 데이터를 가공해주기
// 2. buffer 기본타입은 string 이기 때문에 int 의 경우 형변환 필요
// 3. try - catch문이나 throws로 에러 던져주기

// StringTokenizer 사용
// 공백을 잘라서 하나하나 표현할 수 있음
// StringTokenizer st = new StringTokenizer(br.readLine());
// st.nextToken(); 으로 띄어쓰기 되어있는 곳 하나하나 확인 가능

// String.valueOf(int값) : int를 String 으로 변환