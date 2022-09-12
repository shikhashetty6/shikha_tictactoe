package com.lecture.review.R220912;

import java.util.Scanner;

public class Fibonacci220912 {
    static int[] fibo;
    public static void main(String[] args) {
        Fibonacci220912 fibonacci220912 = new Fibonacci220912();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibonacci220912.solution(n);
    }

    private void solution(int n) {
        fibo = new int[n+1];
        for (int i = 1; i <= n; i++) {
            System.out.print(dfs(i) + " ");
        }
    }

    private int dfs(int n) {
        if(fibo[n]!=0) return fibo[n];
        else if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else{
            return fibo[n] = dfs(n-1) + dfs(n-2);
        }

    }
}
