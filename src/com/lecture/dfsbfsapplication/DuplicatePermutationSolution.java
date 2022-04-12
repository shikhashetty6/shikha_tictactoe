package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class DuplicatePermutationSolution {

    static int[] pm;
    static int n, m;

    private void dfs(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else{
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                dfs(L+1);
            }
        }
    }

    public static void main(String[] args) {
        DuplicatePermutationSolution duplicatePermutationSolution = new DuplicatePermutationSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        duplicatePermutationSolution.dfs(0);
    }

}
