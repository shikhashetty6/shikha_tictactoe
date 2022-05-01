package com.lecture.review.R0501;

import java.util.Scanner;

public class PathSearchArray0501 {

    private static int n, m, count = 0;
    private static int[][] array;
    private static int[] ch;

    private void dfs(int v) {
        if (v == n) count++;
        else {
            for (int i = 1; i <= n; i++) {
                if (array[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PathSearchArray0501 pathSearch = new PathSearchArray0501();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[n+1][m+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int tempX = kb.nextInt();
            int tempY = kb.nextInt();
            array[tempX][tempY] = 1;
        }
        pathSearch.dfs(1);
        System.out.println(count);
    }

}
