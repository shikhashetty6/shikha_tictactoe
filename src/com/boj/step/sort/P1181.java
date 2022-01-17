package com.boj.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < count; i++) {
            set.add(bf.readLine());}
        ArrayList<String> arrayList = new ArrayList<>(set);

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        for (String s : arrayList) {System.out.println(s);}

    }
}
