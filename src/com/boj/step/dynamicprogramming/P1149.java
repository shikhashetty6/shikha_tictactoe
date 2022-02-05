package com.boj.step.dynamicprogramming;

import java.io.*;
import java.util.StringTokenizer;

public class P1149 {

    private int[][] array;
    private int[][] memo;
    private int minValue = Integer.MAX_VALUE;
    int count;

    public static void main(String[] args) throws IOException {
        P1149 p1149 = new P1149();
        p1149.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        array = new int[count][3];
        memo = new int[count][3];

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        memo[0][0] = array[0][0];
        memo[0][1] = array[0][1];
        memo[0][2] = array[0][2];

        for (int i = 1; i < count; i++) {
            memo[i][0] = Math.min(memo[i - 1][1], memo[i - 1][2]) + array[i][0];
            memo[i][1] = Math.min(memo[i - 1][0], memo[i - 1][2]) + array[i][1];
            memo[i][2] = Math.min(memo[i - 1][0], memo[i - 1][1]) + array[i][2];
        }

        bw.write(String.valueOf(Math.min(Math.min(memo[count - 1][0], memo[count - 1][1]), memo[count - 1][2])));
        bw.flush();
        bw.close();
        br.close();
    }

}
