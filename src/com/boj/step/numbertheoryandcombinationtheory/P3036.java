package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P3036 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstValue = 0;

        for (int i = 0; i < count; i++) {
            int value = Integer.valueOf(st.nextToken());
            if (i == 0) {
                firstValue = value;
            } else {

                int max = Math.max(firstValue, value);
                int maxDivisor = 0;

                for (int j = 2; j <= max; j++) {
                    if((firstValue%j==0)&&(value%j==0)){
                        maxDivisor = j;
                    }
                }
                if (maxDivisor == 0) {
                    bw.write((firstValue/1)+"/"+(value/1));
                } else {
                    bw.write((firstValue/maxDivisor)+"/"+(value/maxDivisor));
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
