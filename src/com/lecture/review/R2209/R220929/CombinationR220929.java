package com.lecture.review.R2209.R220929;

import java.util.Scanner;

public class CombinationR220929 {

    static int[] combi;
    static int n, m;

    public static void main(String[] args) {
        CombinationR220929 combinationR220929 = new CombinationR220929();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];

        combinationR220929.solution();
    }

    private void solution() {
        dfs(0, 1);
    }

    private void dfs(int L, int s) {
        if (L == m) {
            for (int i : combi) {
                System.out.print(i +" ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }
}
