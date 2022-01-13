package com.boj.step.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class P2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = Integer.parseInt(bf.readLine());

        for (int i = 0; i < count; i++) arrayList.add(Integer.parseInt(bf.readLine()));

        Collections.sort(arrayList);

        for (Integer integer : arrayList) {
            bw.write(String.valueOf(integer));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
