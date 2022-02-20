package com.boj.step.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class P1541 {

    public static void main(String[] args) throws IOException {
        P1541 p1541 = new P1541();
        p1541.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MAX_VALUE;

        while (subtraction.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

            while (addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}
