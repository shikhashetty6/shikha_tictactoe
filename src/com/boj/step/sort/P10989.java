package com.boj.step.sort;

import java.io.*;
import java.util.Arrays;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bf.readLine());
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = Integer.valueOf(bf.readLine());
        }

        Arrays.sort(array);

        for(int i=0; i<count; i++){
            bw.write(String.valueOf(array[i]));
            bw.newLine();
        }
        bw.flush();
        bf.close();
        bw.close();
    }

}
