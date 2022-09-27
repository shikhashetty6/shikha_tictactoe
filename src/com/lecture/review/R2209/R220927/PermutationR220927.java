package com.lecture.review.R2209.R220927;

import java.util.Scanner;

public class PermutationR220927 {
    static int[] array, pm, ch;
    static int n, m;

    public static void main(String[] args) {
        PermutationR220927 permutationR220927 = new PermutationR220927();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[n];
        pm = new int[m];
        ch = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }

        permutationR220927.solution();
    }

    private void solution() {
        dfs(0);
    }

    private void dfs(int L) {
        if (L == m) {
            for (int i : pm) {
                System.out.print(i+" ");
            }
            System.out.println();

        }else{
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i]=1;
                    pm[L] = array[i];
                    dfs(L+1);
                    ch[i]=0;
                }
            }
        }

    }
}
