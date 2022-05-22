package com.lecture.array;

import java.util.Scanner;

public class Fibonnaci {
    private static int[] dp;
    public static void main(String[] args) {
        Fibonnaci fibonnaci = new Fibonnaci();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonnaci.solution(i)+" ");
        }

    }

    private int solution(int n) {
        if(dp[n]>0) return dp[n];
        else if(n==1) return 1;
        else if(n==2) return 1;
        else return dp[n] = solution(n-2) + solution(n-1);
    }
}
