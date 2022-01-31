package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int result;
        int input;

        if (count == 1) {
            input = Integer.parseInt(st.nextToken());
            result = input * input;
            bw.write(String.valueOf(result));
        } else {
            while (count -- > 0) {
                input = Integer.parseInt(st.nextToken());
                if(maxValue<input) maxValue = input;
                if(minValue>input) minValue = input;
            }
            result = maxValue*minValue;
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
