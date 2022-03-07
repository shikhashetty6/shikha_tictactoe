package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class Review2P11053 {
    int[] array;
    int[] memo;
    int maxValue = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        Review2P11053 reviewP11053 = new Review2P11053();
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
            lis(i);
        }

        bw.write(String.valueOf(maxValue));
        bw.flush();
        bw.close();
        br.close();

    }

    public int lis(int n){

        if (memo[n] == 0) {
            memo[n]=1;
        }

        for(int i = n - 1; i >= 0; i--) {
            if(array[i] < array[n]) {
                memo[n] = Math.max(memo[n], lis(i) + 1);
            }
        }

		return memo[n];
    }
}
