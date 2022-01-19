package com.boj.step.sort;

import java.io.*;

public class P2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer inputCount = Integer.parseInt(bf.readLine());

        int[] aLotOfValueArray = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int medianValue = 10000;
        int aLotOfValue = 10000;
        int maxALotOfValue = 0;
        boolean check = false;

        for (int i = 0; i < inputCount; i++) {
            int input = Integer.parseInt(bf.readLine());
            aLotOfValueArray[input+4000]++;
            sum += input;
            if (max < input) max = input;
            if (min > input) min = input;
        }

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (aLotOfValueArray[i] > 0) {

                if (count < ((inputCount / 2) + 1)) {
                    count += aLotOfValueArray[i];
                    medianValue = i - 4000;}

                if(maxALotOfValue < aLotOfValueArray[i]) {
                    maxALotOfValue = aLotOfValueArray[i];
                    aLotOfValue = i - 4000;
                    check = true;}
                else if(maxALotOfValue == aLotOfValueArray[i] && check == true) {
                    aLotOfValue = i - 4000;
                    check = false;}

            }
        }

        bw.write(String.valueOf((int)Math.round((double)sum / inputCount)));
        bw.newLine();
        bw.write(String.valueOf(medianValue));
        bw.newLine();
        bw.write(String.valueOf(aLotOfValue));
        bw.newLine();
        bw.write(String.valueOf(max-min));
        bw.flush();
        bf.close();
        bw.close();
    }
}
