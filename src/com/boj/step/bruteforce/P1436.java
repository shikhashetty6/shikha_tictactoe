package com.boj.step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(bf.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        String value = "666";
        while (true) {
            if (arrayList.size() == input) break;
            if (value.contains("666")) arrayList.add(Integer.parseInt(value));
            int temp = Integer.parseInt(value) + 1;
            value = String.valueOf(temp);}

        System.out.println(arrayList.get(input-1));

        }
}
