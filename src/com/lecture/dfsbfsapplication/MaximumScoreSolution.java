package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class MaximumScoreSolution {

    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;

    private void dfs(int L, int sum, int time, int[] ps, int[] pt) {
        if(time>m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        }
        else{
            dfs(L+1, sum+ps[L], time+pt[L], ps, pt);
            dfs(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        MaximumScoreSolution maximumScoreSolution = new MaximumScoreSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        maximumScoreSolution.dfs(0, 0, 0, a, b);
        System.out.println(answer);
    }

}
