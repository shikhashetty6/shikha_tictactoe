package com.boj.step.dynamicprogramming;

import java.io.*;

public class ReviewP1463 {

    Integer[] memo;

    public static void main(String[] args) throws IOException {
        ReviewP1463 reviewP1463 = new ReviewP1463();
        reviewP1463.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        memo = new Integer[n+1];
        memo[0] = memo[1] = 0;

        int dp = dp(n);
        bw.write(String.valueOf(dp));
        bw.flush();
        bw.close();
        br.close();

    }

    private int dp(int n) {

        if (memo[n] == null) {
            if (n % 6 == 0) {
                memo[n] = Math.min(dp(n/3), Math.min(dp(n/2), dp(n-1))) + 1;
            }
            else if (n % 3 == 0) {
                memo[n] = Math.min(dp(n/3), dp(n-1)) + 1;
            }
            else if (n % 2 == 0) {
                memo[n] = Math.min(dp(n/2), dp(n-1)) + 1;
            }
            else{
                memo[n] = dp(n-1) + 1;
            }
        }
        return memo[n];

    }
}
