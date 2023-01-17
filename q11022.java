import java.util.Scanner;

public class q11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b;

        int[] arr = new int[n];
        int[] inputA = new int[n];
        int[] inputB = new int[n];
        for(int i = 0; i < arr.length; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            inputA[i] = a;
            inputB[i] = b;
            arr[i] = a + b;
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println("Case #" + (j+1) + ": " + inputA[j] + " + " + inputB[j] + " = " + arr[j]);
        }
        sc.close();
    }
}

// ArrayList<Integer> inputValue =  new ArrayList<Integer>();
