import java.util.Scanner;

public class q10952{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arr[i] = a + b;
            if(a == 0 && b == 0){
                System.out.println(a + b);
            }
        }
        
        for(int j = 0; j < arr.length; j++){
            System.out.println("Case #" + (j+1) + ": " + arr[j]);
        }
        sc.close();
    }
}