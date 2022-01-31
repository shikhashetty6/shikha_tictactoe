package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P1010 {

    private double[] memo = new double[30];

    public static void main(String[] args) throws IOException {
        P1010 p1010 = new P1010();
        p1010.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            bw.write(String.format("%.0f", factorial(n)/(factorial(k)*(factorial(n-k)))));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private double factorial(int i) {
        if (i < 2) {
            return 1;
        }

        if (memo[i] == 0) {
            memo[i] = i * factorial(i-1);
        }
        return memo[i];
    }
}
