package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;

public class P1676 {

    private int count;
    public static void main(String[] args) throws IOException {

        P1676 p1676 = new P1676();
        p1676.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        while (input >= 5) {
            count += input / 5;
            input /= 5;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }

}
