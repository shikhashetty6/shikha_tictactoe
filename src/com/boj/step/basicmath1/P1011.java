package com.boj.step.basicmath1;

import java.io.*;
import java.util.StringTokenizer;

public class P1011 {
    public static void main(String[] args) throws IOException {
        P1011 p1011 = new P1011();
        p1011.solve();
    }

    public void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer count = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer;
        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            Integer currentPosition = Integer.parseInt(stringTokenizer.nextToken());
            Integer targetPosition = Integer.parseInt(stringTokenizer.nextToken());

            int distance = targetPosition - currentPosition;

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)) bw.write(String.valueOf(max * 2 - 1));
            else if(distance <= max * max + max) bw.write(String.valueOf(max * 2));
            else bw.write(String.valueOf(max * 2 + 1));

            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
    }

}
