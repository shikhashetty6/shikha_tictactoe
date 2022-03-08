package com.boj.step.dynamicprogramming;

import java.io.*;

public class ReviewP9461 {

    private long[] memo = new long[101];

    public static void main(String[] args) throws IOException {
        ReviewP9461 reviewP9461 = new ReviewP9461();
        reviewP9461.solve();
    }

    private void solve() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        memo[1] = 1;
        memo[2] = 1;

        int count = Integer.parseInt(br.readLine());

        while (count-- > 0) {
            bw.write(String.valueOf(dp(Integer.parseInt(br.readLine()))));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private long dp(int n) {

        if (n <= 3) {
            return 1;
        } else if (memo[n] == 0) {
            memo[n] = dp(n - 3) + dp(n - 2);
        }
        return memo[n];
    }
}
