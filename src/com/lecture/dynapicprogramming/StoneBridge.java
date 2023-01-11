package com.lecture.dynapicprogramming;

import java.util.Scanner;

public class StoneBridge {
    static int[] dp;
    public static void main(String[] args) {
        StoneBridge stoneBridge = new StoneBridge();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dp = new int[n+2];
        System.out.println(stoneBridge.solution(n));
    }

    private int solution(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n+1; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n+1];
    }
}
