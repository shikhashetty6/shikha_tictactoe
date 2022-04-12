package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class MaximumScore {

    private static int n, m;
    private static int maximumScoreResult = Integer.MIN_VALUE;
    private static int[] arrayScore, arrayTime;

    private void dfs(int L, int sumScore, int sumTime) {
        if(sumTime>m) return;
        if (L == n) {
            maximumScoreResult = Math.max(maximumScoreResult, sumScore);
        }
        else{
            dfs(L+1, sumScore+arrayScore[L], sumTime+arrayTime[L]);
            dfs(L+1, sumScore, sumTime);

        }
    }

    public static void main(String[] args) {
        MaximumScore maximumScore = new MaximumScore();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arrayScore = new int[n];
        arrayTime = new int[n];

        for (int i = 0; i < n; i++) {
            arrayScore[i] = kb.nextInt();
            arrayTime[i] = kb.nextInt();
        }

        maximumScore.dfs(0, 0, 0);
        System.out.println(maximumScoreResult);
    }
}
