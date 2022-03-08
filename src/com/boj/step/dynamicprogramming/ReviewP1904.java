package com.boj.step.dynamicprogramming;

import java.io.*;

public class ReviewP1904 {

    private int[] memo;

    public static void main(String[] args) throws IOException {
        ReviewP1904 reviewP1904 = new ReviewP1904();
        reviewP1904.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        memo = new int[input+1];

        bw.write(String.valueOf(dp(input)));
        bw.flush();
        bw.close();
        br.close();
    }

    private int dp(int n) {

        if (n < 2){
            return 1;
        } else if(memo[n] == 0) {
            memo[n] = (dp(n-2) + dp(n-1))%15746;
        }
        return memo[n];
    }
}
