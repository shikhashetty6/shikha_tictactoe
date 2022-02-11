package com.boj.step.dynamicprogramming;

import java.io.*;

public class ReviewP1003 {

    Integer[][] memo = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        ReviewP1003 reviewP1003 = new ReviewP1003();
        reviewP1003.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        memo[0][0] = 1;
        memo[0][1] = 0;
        memo[1][0] = 0;
        memo[1][1] = 1;

        for (int i = 0; i < count; i++) {
            int value = Integer.parseInt(br.readLine());
            fibonacci(value);
            bw.write(memo[value][0] + " " + memo[value][1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private Integer[] fibonacci(int n) {
        if (memo[n][0] == null || memo[n][1] == null) {
            memo[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            memo[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return memo[n];
    }
}
