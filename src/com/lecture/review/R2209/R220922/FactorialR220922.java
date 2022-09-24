package com.lecture.review.R2209.R220922;

import java.util.Scanner;

public class FactorialR220922 {
    public static void main(String[] args) {
        FactorialR220922 factorialR220922 = new FactorialR220922();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        factorialR220922.solution(n);
    }

    private void solution(int n) {
        System.out.println(dfs(n));
    }

    private int dfs(int n) {
        if(n==1) return 1;
        else{
            return n * dfs(n-1);
        }
    }
}
