package com.lecture.review.R2209.R220926;

import java.util.Scanner;

public class DuplicatePermutationR220926 {
    static int n,m;
    static int[] pm;

    public static void main(String[] args) {
        DuplicatePermutationR220926 duplicatePermutationR220926 = new DuplicatePermutationR220926();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];

        duplicatePermutationR220926.solution();
    }

    private void solution() {
        dfs(0);
    }

    private void dfs(int L) {
        if (L == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else{
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                dfs(L+1);
            }
        }
    }
}
