package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class P11053 {

    int[] array;
    int[] memo;
    int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        P11053 p11053 = new P11053();
        p11053.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        array = new int[count];
        memo = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < count; i++) {
            memo[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && memo[i] < memo[j] + 1) {
                    memo[i] = memo[j] + 1;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            if (memo[i] > max) {
                max = memo[i];
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();

    }
}
