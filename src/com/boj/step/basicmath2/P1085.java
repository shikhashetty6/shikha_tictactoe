package com.boj.step.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        Integer x = Integer.parseInt(stringTokenizer.nextToken());
        Integer y = Integer.parseInt(stringTokenizer.nextToken());
        Integer w = Integer.parseInt(stringTokenizer.nextToken());
        Integer h = Integer.parseInt(stringTokenizer.nextToken());

        arrayList.add(x);
        arrayList.add(y);
        arrayList.add(w-x);
        arrayList.add(h-y);

        Collections.sort(arrayList);

        System.out.println(arrayList.get(0));
    }
}