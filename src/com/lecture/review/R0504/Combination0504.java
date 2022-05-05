package com.lecture.review.R0504;

import java.util.Scanner;

public class Combination0504 {
    private static int n, r;
    private static int[][] array = new int[34][34];
    private int dfs(int n, int r) {
        if(r==0) return 1;
        if(n==r) return 1;
        if (array[n][r] != 0) {
            return array[n][r];
        } else {
            return array[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
        }
    }

    public static void main(String[] args) {
        Combination0504 combination0504 = new Combination0504();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();
        System.out.println(combination0504.dfs(n, r));
    }

}
