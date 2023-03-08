package oneDimensionalArray;

import java.util.Scanner;

public class q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = 0;
        double totalScore = 0;

        int[] grades = new int[N];
        double[] grades_ = new double[N];

        for(int i = 0; i < N; i++){
            int grade = sc.nextInt();
            grades[i] = grade;
        }

        for(int i = 0; i < N; i++){
            M = Math.max(M, grades[i]);
        }

        for(int i = 0; i < N; i++){
            grades_[i] = grades[i] / (double)M *100;
        }
        
        for(int i = 0; i < N; i++){
            totalScore += grades_[i];
        }

        System.out.println(totalScore / N);

    }
}

