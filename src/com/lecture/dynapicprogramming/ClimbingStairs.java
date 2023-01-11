package com.lecture.dynapicprogramming;

import java.util.Scanner;

public class ClimbingStairs {

    private static int[] dp;

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dp = new int[n+1];
        System.out.println(climbingStairs.solution(n));
    }

    private int solution(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
