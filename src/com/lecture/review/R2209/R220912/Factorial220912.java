package com.lecture.review.R2209.R220912;

import java.util.Scanner;

public class Factorial220912 {
    public static void main(String[] args) {
        Factorial220912 factorial220912 = new Factorial220912();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        factorial220912.solution(n);
    }

    private void solution(int n) {
        System.out.print(dfs(n));
    }

    private int dfs(int n) {
        if(n==1) return 1;
        else{
            return n * dfs(n-1);
        }
    }
}
