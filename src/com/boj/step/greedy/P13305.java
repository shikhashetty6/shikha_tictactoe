package com.boj.step.greedy;

import java.io.*;
import java.util.*;

public class P13305 {

    long[] length;
    long[] cost;

    public static void main(String[] args) throws IOException {
        P13305 p13305 = new P13305();
        p13305.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        length = new long[count-1];
        cost = new long[count-1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < count-1; i++) {
            length[i] = Integer.parseInt(st1.nextToken());
            cost[i] = Integer.parseInt(st2.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];

        for (int i = 0; i < count - 1; i++) {

            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (length[i] * minCost);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}
