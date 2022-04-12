package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class Review3P11053 {

    int[] input;

    public static void main(String[] args) throws IOException {
        Review3P11053 review3P11053 = new Review3P11053();
        review3P11053.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }


    }
}
