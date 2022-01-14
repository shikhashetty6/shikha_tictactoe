package com.boj.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            String substring = input.substring(i, i + 1);
            arrayList.add(substring);
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        for (String s : arrayList) {
            System.out.print(s);
        }
    }
}
