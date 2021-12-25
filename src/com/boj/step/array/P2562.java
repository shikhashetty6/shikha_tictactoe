package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<9; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            arrayList.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        int maxValue = 0;
        int index = 0;

        for(int i=0; i<arrayList.size(); i++){
            if (maxValue < arrayList.get(i)) {
                maxValue = arrayList.get(i);
                index = i+1;
            }
        }

        System.out.println(maxValue);
        System.out.print(index);

    }
}
