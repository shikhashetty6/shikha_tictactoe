package com.boj.step.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1931 {

    int[][] time;

    public static void main(String[] args) throws IOException {
        P1931 p1931 = new P1931();
        p1931.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        time = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.valueOf(st.nextToken());
            time[i][1] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for(int i = 0; i < n; i++) {

            if(prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
