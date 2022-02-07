package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P2004 {

    public static void main(String[] args) throws IOException {
        P2004 p2004 = new P2004();
        p2004.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());

        int fiveCount = getFiveCount(n) - getFiveCount(k) - getFiveCount(n-k);
        int twoCount = getTwoCount(n) - getTwoCount(k) - getTwoCount(n-k);

        int min = Math.min(fiveCount, twoCount);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();

    }

    private int getFiveCount(int input) {
        int count = 0;
        while (input >= 5) {
            count += input / 5;
            input /= 5;
        }
        return count;
    }

    private int getTwoCount(int input) {
        int count = 0;
        while (input >= 2) {
            count += input / 2;
            input /= 2;
        }
        return count;
    }
}
