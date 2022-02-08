package com.boj.step.dynamicprogramming;

import java.io.*;

public class P2579 {

    private int[] array;
    private Integer[] memo;
    int count;

    public static void main(String[] args) throws IOException {
        P2579 p2579 = new P2579();
        p2579.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = Integer.parseInt(br.readLine());
        array = new int[count+1];
        memo = new Integer[count+1];
        for(int i = 1; i <= count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        memo[0] = array[0];
        memo[1] = array[1];

        if(count >= 2) {
            memo[2] = array[1] + array[2];
        }

        bw.write(String.valueOf(dp(count)));
        bw.flush();
        bw.close();
        br.close();
    }

    private int dp(int n) {
        if(memo[n] == null) {
            memo[n] = Math.max(dp(n - 2), dp(n - 3) + array[n - 1]) + array[n];
        }
        return memo[n];
    }
}
