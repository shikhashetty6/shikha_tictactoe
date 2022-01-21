package com.boj.step.dynamicprogramming;

import java.io.*;

public class P9461 {

    long inputCount;
    long[] array;

    public static void main(String[] args) throws IOException {
        P9461 p9461 = new P9461();
        p9461.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        inputCount = Integer.parseInt(bf.readLine());

        for (int i = 0; i < inputCount; i++) {
            int input = Integer.parseInt(bf.readLine());
            array = new long[input];
            bw.write(String.valueOf(wave(input-1)));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }

    private long wave(int input) {

        if (input == 0 || input == 1 || input == 2) {
            if (array[input] == 0) {
                array[input] = 1;
            }
            return array[input];
        }
        if (array[input] == 0) {
            array[input] = wave(input-3) + wave(input-2);
        }
        return array[input];

    }
}
