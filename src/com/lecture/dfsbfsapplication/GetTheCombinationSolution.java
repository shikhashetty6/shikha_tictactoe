package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class GetTheCombinationSolution {

    private static int n,m;
    private static int[] result;

    private void dfs(int L, int s) {
        if (L == m) {
            for (int i : result) System.out.print(i + " ");
            System.out.println();
        }
        else{
            for (int i = s; i <= n; i++) {
                result[L] = i;
                dfs(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        GetTheCombinationSolution getTheCombination = new GetTheCombinationSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        result = new int[m];
        getTheCombination.dfs(0, 1);
    }

}
