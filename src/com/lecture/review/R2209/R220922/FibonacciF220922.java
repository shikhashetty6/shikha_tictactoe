package com.lecture.review.R2209.R220922;

import java.util.Scanner;

public class FibonacciF220922 {

    static int[] fibo;
    public static void main(String[] args) {
        FibonacciF220922 fibonacciF220922 = new FibonacciF220922();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibo = new int[n+1];
        fibonacciF220922.solution(10);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }

    private int solution(int n) {
        if(fibo[n]!=0) return fibo[n];
        else if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else{
            return fibo[n] = solution(n-1) + solution(n-2);
        }
    }
}
