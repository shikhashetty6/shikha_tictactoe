package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> arrayList = new ArrayList<>();
        double sum = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());

        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        for(int i=0; i<count; i++){
            arrayList.add(Double.parseDouble(stringTokenizer.nextToken())); }

        double maxValue = 0;
        for(int i=0; i<arrayList.size(); i++){
            if (maxValue < arrayList.get(i)) {
                maxValue = arrayList.get(i); } }

        for (Double value : arrayList) {
            sum += ((value/maxValue)*100); }

        System.out.println(sum/arrayList.size());
    }
}
