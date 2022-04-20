package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class GuessingTheSequenceSolution {

    static int n, f;
    static int[] b, p, ch;
    boolean flag = false;
    int[][] dy = new int[35][35];

    private void dfs(int L, int sum) {
        if(flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        }
        else{
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    dfs(L+1, sum+(p[L]*b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    private int combi(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combi(n-1, r-1)+combi(n-1, r);
    }

    public static void main(String[] args) {
        GuessingTheSequenceSolution guessingTheSequence = new GuessingTheSequenceSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        p = new int[n];
        ch= new int[n+1];
        for (int i = 0; i < n; i++) {
            b[i] = guessingTheSequence.combi(n-1, i);
        }
        guessingTheSequence.dfs(0, 0);
    }
}
