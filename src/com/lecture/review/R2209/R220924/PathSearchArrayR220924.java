package com.lecture.review.R2209.R220924;

import java.util.Scanner;

public class PathSearchArrayR220924 {

    static int[][] array;
    static int[] ch;
    static int n, m, answer;

    public static void main(String[] args) {
        PathSearchArrayR220924 pathSearchArrayR220924 = new PathSearchArrayR220924();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            array[a][b] = 1;
        }
        pathSearchArrayR220924.solution();
    }

    private void solution() {
        ch[1] = 1;
        dfs(1);
        System.out.println(answer);
    }

    private void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (array[v][i] != 0 && ch[i] != 1) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
