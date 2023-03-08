package repeat;

import java.util.Scanner;

public class q25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int dataType = N/4;
    
        for(int i = 0; i < dataType; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
