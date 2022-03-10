package com.boj.step.dynamicprogramming;

import java.io.*;

public class ReviewP2579 {

    int[] input;
    Integer[] memo;

    public static void main(String[] args) throws IOException {
        ReviewP2579 reviewP2579 = new ReviewP2579();
        reviewP2579.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        input = new int[n+1];
        memo = new Integer[n+1];

        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        memo[0] = input[0];
        memo[1] = input[1];
        if (n >= 2) memo[2] = input[1] + input[2];

        int result = dp(n);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    private int dp(int i) {
        if(memo[i]==null)
            memo[i] = Math.max(dp(i-2), dp(i-3)+input[i-1]) + input[i];
        return memo[i];
    }
}
