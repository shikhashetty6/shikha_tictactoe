package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP11053 {

    int[] array;
    int[] memo;
    int maxValue = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        ReviewP11053 reviewP11053 = new ReviewP11053();
        reviewP11053.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        array = new int[count];
        memo = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < count; i++) {
            memo[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && memo[i] < memo[j] + 1){
                    memo[i] = memo[j] + 1;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            if (maxValue < memo[i]) {
                maxValue = memo[i];
            }
        }

        bw.write(String.valueOf(maxValue));
        bw.flush();
        bw.close();
        br.close();

    }
}
