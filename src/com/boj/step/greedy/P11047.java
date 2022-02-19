package com.boj.step.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class P11047 {

    int[] array;

    public static void main(String[] args) throws IOException {
        P11047 p11047 = new P11047();
        p11047.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;
        int tempValue = k;
        int count = n-1;
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        while (true) {
            for (int i = count; i >= 0; i--) {
                if (array[i] <= tempValue) {
                    result += tempValue/array[i];
                    tempValue = tempValue%array[i];
                }
            }
            if (tempValue == 0) {
                break;
            }
            count--;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
