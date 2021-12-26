package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<List<Integer>> arrayList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            arrayList.add(new ArrayList<>());
            while (stringTokenizer.hasMoreTokens()) {
                arrayList.get(i).add(Integer.parseInt(stringTokenizer.nextToken())); }}

        for(int j = 0; j < arrayList.size(); j++){
            double average;
            int overAverageCount = 0;
            int sum = 0;
            for (int i = 1; i < arrayList.get(j).size(); i++) {
                sum += arrayList.get(j).get(i); }
            average = sum/(arrayList.get(j).size()-1);
            for (int i = 1; i < arrayList.get(j).size(); i++) {
                if(arrayList.get(j).get(i)>average){
                    overAverageCount++; } }
            System.out.println(String.format("%.3f",
                    Double.parseDouble(String.valueOf(overAverageCount))/Double.parseDouble(String.valueOf(arrayList.get(j).size()-1))*100)+"%");
        }

    }
}
