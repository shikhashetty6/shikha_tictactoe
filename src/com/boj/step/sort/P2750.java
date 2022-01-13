package com.boj.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = Integer.parseInt(bf.readLine());

        for (int i = 0; i < count; i++) arrayList.add(Integer.parseInt(bf.readLine()));

        Collections.sort(arrayList);

        for (Integer integer : arrayList) System.out.println(integer);

    }
}
