package com.boj.step.dynamicprogramming;

import java.io.*;

public class P1904 {

    private int[] memo;

    public static void main(String[] args) throws IOException {
        P1904 p1904 = new P1904();
        p1904.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        memo = new int[count+1];

       bw.write(String.valueOf(dp(count)));
       bw.flush();
       bw.close();
       br.close();
    }

    private int dp(int n) {
        if (n < 2) {
            return 1;
        } else if (memo[n] == 0) {
            memo[n] = (dp(n-2) + dp(n-1)) % 15746;
        }
        return memo[n];
    }
}
