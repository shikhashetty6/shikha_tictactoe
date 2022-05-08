package com.lecture.review.R0505;

import java.util.Scanner;

public class FindCombination0505 {

    private static int n, m;
    private static int[] array;

    private void dfs(int L, int s) {

        if (L == m) {
            for (int i : array) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                    array[L] = i;
                    dfs(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        FindCombination0505 findCombination0505 = new FindCombination0505();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[m];
        findCombination0505.dfs(0, 1);
    }
}
