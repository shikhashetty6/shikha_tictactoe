package com.boj.step.sort;

import java.io.*;
import java.util.*;

public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int rank = 0;

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(stringTokenizer.nextToken());
            arrayList.add(input);
            sortedArrayList.add(input);}

        Collections.sort(sortedArrayList);

        for (Integer integer : sortedArrayList) {
            if (!hashMap.containsKey(integer)) {
                hashMap.put(integer, rank);
                rank++;}}

        for (Integer integer : arrayList) {bw.write(hashMap.get(integer)+ " ");}

        bw.flush();
        bf.close();
        bw.close();
    }

}
