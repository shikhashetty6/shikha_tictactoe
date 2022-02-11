package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP1932 {

    int[][] array;
    Integer[][] memo;
    int input;

    public static void main(String[] args) throws IOException {
        ReviewP1932 reviewP1932 = new ReviewP1932();
        reviewP1932.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = Integer.parseInt(br.readLine());

        array = new int[input][input];
        memo = new Integer[input][input];

        for (int i = 0; i < input; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for (int i = 0; i < input; i++) {
            memo[input-1][i] = array[input-1][i];
        }

        int max = dp(0, 0);
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();

    }

    private int dp(int depth, int index) {

        if (depth == input-1) {
            return memo[depth][index];
        }

        if(memo[depth][index] == null){
            memo[depth][index] = array[depth][index] + Math.max(dp(depth+1, index), dp(depth+1, index+1));
        }
        return memo[depth][index];

    }
}
