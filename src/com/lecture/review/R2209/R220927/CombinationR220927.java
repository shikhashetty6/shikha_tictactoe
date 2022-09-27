package com.lecture.review.R2209.R220927;

import java.util.Scanner;

public class CombinationR220927 {

    static int[][] dy = new int[35][35];
    static int n,r;

    public static void main(String[] args) {
        CombinationR220927 combinationR220927 = new CombinationR220927();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();
        combinationR220927.solution();
    }

    private void solution() {
        System.out.println(dfs(n, r));
    }

    private int dfs(int n, int r) {
        if(dy[n][r] >0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
    }
}
