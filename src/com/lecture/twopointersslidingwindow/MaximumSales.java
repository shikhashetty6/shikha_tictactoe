package com.lecture.twopointersslidingwindow;

import java.util.Scanner;

public class MaximumSales {
    public static void main(String[] args) {
        MaximumSales maximumSales = new MaximumSales();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(maximumSales.solution(N, K, array));
    }

    private int solution(int N, int K, int[] array) {
        int answer, sum=0;
        for(int i=0; i<K; i++) sum+=array[i];
        answer=sum;
        for(int i=K; i<N; i++){
            sum+=(array[i]-array[i-K]);
            answer=Math.max(answer, sum);
        }
        return answer;
    }
}
