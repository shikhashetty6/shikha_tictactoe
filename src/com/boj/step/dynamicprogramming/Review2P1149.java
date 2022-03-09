package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class Review2P1149 {

    int[][] input;
    int[][] memo;

    public static void main(String[] args) throws IOException {
        Review2P1149 review2P1149 = new Review2P1149();
        review2P1149.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        input = new int[n][3];
        memo = new int[n][3];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
            input[i][2] = Integer.parseInt(st.nextToken());
        }

        memo[0][0] = input[0][0];
        memo[0][1] = input[0][1];
        memo[0][2] = input[0][2];

        for (int i = 1; i < n; i++) {
            memo[i][0] = Math.min(memo[i-1][1], memo[i-1][2]) + input[i][0];
            memo[i][1] = Math.min(memo[i-1][0], memo[i-1][2]) + input[i][1];
            memo[i][2] = Math.min(memo[i-1][0], memo[i-1][1]) + input[i][2];
        }

        bw.write(String.valueOf(Math.min(Math.min(memo[n - 1][0], memo[n - 1][1]), memo[n - 1][2])));
        bw.flush();
        bw.close();
        br.close();
    }
}
