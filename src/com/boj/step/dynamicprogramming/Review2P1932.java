package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class Review2P1932 {

    int[][] input;
    int[][] memo;

    public static void main(String[] args) throws IOException {
        Review2P1932 review2P1932 = new Review2P1932();
        review2P1932.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        input = new int[n][n];
        memo = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            memo[n-1][i] = input[n-1][i];
        }

        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                memo[i][j] = Math.max(memo[i+1][j], memo[i+1][j+1]) + input[i][j];
            }
        }

        bw.write(String.valueOf(memo[0][0]));
        bw.flush();
        bw.close();
        br.close();

    }
}
