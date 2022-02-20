package com.boj.step.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399 {

    int[] array;

    public static void main(String[] args) throws IOException {
        P11399 p11399 = new P11399();
        p11399.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        array = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int prev=0;
        int sum=0;

        for (int i = 0; i < count; i++) {
            sum += prev + array[i];
            prev += array[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}
