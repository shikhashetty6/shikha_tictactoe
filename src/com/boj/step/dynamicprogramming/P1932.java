package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class P1932 {

    int[][] array;
    Integer[][] dp;
    int inputCount = 0;

    public static void main(String[] args) throws IOException {
        P1932 p1932 = new P1932();
        p1932.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        inputCount = Integer.parseInt(bf.readLine());

        StringTokenizer stringTokenizer;
        array = new int[inputCount][inputCount];
        dp = new Integer[inputCount][inputCount];

        for (int i = 0; i < inputCount; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            for (int j = 0; j < i + 1; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for (int i = 0; i < inputCount; i++) {
            dp[inputCount-1][i] = array[inputCount-1][i];
        }

        bw.write(String.valueOf(dp(0,0)));
        bw.flush();
        bw.close();
        bf.close();

    }

    private int dp(int a, int b) {
        if (a == inputCount-1) {
            return dp[a][b];
        }

        if (dp[a][b] == null) {
            dp[a][b] = Math.max(dp(a+1,b),dp(a+1,b+1))+array[a][b];
        }
        return dp[a][b];
    }
}
