package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP1149 {

    int[][] array;
    Integer[][] memo;

    public static void main(String[] args) throws IOException {
        ReviewP1149 reviewP1149 = new ReviewP1149();
        reviewP1149.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        array = new int[input][input];
        memo = new Integer[input][input];

        for (int i = 0; i < input; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < input; j++) {
                int temp = Integer.parseInt(st.nextToken());
                array[i][j] = temp;
            }
        }

        memo[0][0] = array[0][0];
        memo[0][1] = array[0][1];
        memo[0][2] = array[0][2];

        for (int i = 1; i < input; i++) {
            memo[i][0] = Math.min(memo[i - 1][1], memo[i - 1][2]) + array[i][0];
            memo[i][1] = Math.min(memo[i - 1][0], memo[i - 1][2]) + array[i][1];
            memo[i][2] = Math.min(memo[i - 1][0], memo[i - 1][1]) + array[i][2];
        }

        bw.write(String.valueOf(Math.min(Math.min(memo[input - 1][0], memo[input - 1][1]), memo[input - 1][2])));
        bw.flush();
        bw.close();
        br.close();
    }
}
