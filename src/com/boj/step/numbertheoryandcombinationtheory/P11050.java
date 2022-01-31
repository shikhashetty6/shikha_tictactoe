package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P11050 {

    public static void main(String[] args) throws IOException {
        P11050 p11050 = new P11050();
        p11050.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(factorial(n)/(factorial(k)*(factorial(n-k)))));
        bw.flush();
        bw.close();
        br.close();
    }

    private int factorial(int i) {
        if (i < 2) {
            return 1;
        }
        return i * factorial(i-1);

    }
}
