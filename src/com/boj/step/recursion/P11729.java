package com.boj.step.recursion;

import java.io.*;

public class P11729 {

    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int totalCount = (int)Math.pow(2, input) - 1;
        bw.write(String.valueOf(totalCount));
        bw.newLine();
        hanoi(input, 1, 2, 3);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void hanoi(int input, int start, int mid, int to) throws IOException {
        if (input == 1) {
            bw.write(start + " " + to);
            bw.newLine();
            return;
        }
        hanoi(input-1, start, to, mid);
        bw.write(start + " " + to);
        bw.newLine();
        hanoi(input-1, mid, start, to);
    }
}
