package com.boj.step.basicmath1;

import java.io.*;

public class P2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer inputCount = Integer.parseInt(bf.readLine());

        for (int i = 0; i < inputCount; i++) {
            Integer inputFloor = Integer.parseInt(bf.readLine());
            Integer inputRoom = Integer.parseInt(bf.readLine());

            int[][] array = new int[inputFloor+1][inputRoom];

            for (int j = 0; j < inputFloor + 1; j++) {
                for (int k = 0; k < inputRoom; k++) {
                    if (j == 0) {
                        array[j][k] = k + 1;
                    } else{
                        for (int l = 0; l < k + 1; l++) {
                            array[j][k] = array[j][k] + array[j-1][k-l];
                        }
                    }
                }
            }
            bw.write(String.valueOf(array[inputFloor][inputRoom-1]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
