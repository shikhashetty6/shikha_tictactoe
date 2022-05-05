package com.lecture.review.R0504;

import java.util.Scanner;

public class GuessingTheSequence0504 {

    private static int n, f;
    private static int[][] comb = new int[35][35];
    private static int[] b, ch, pm;
    private static boolean flag;
    private void dfs(int L, int sum) {
        if(flag) return;
        if (L == n) {
            if(sum == f){
                for (int i : pm) System.out.print(i + " ");
                flag = true;
            }
        } else{
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = i;
                    dfs(L+1, sum+(pm[L]*b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    private int combi(int n, int r) {
        if(comb[n][r]!=0) return comb[n][r];
        else if(r == 0 || n == r) return 1;
        else {
            return comb[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }
    }

    public static void main(String[] args) {
        GuessingTheSequence0504 guessingTheSequence0504 = new GuessingTheSequence0504();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        ch = new int[n+1];
        pm = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = guessingTheSequence0504.combi(n-1, i);
        }
        guessingTheSequence0504.dfs(0, 0);
    }


}
