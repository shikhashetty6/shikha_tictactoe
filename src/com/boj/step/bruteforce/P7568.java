package com.boj.step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer;
        ArrayList<Integer> weightList = new ArrayList<>();
        ArrayList<Integer> heightList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            Integer weight = Integer.parseInt(stringTokenizer.nextToken());
            Integer height = Integer.parseInt(stringTokenizer.nextToken());
            weightList.add(weight);
            heightList.add(height);
        }
        for (int i = 0; i < weightList.size(); i++) {
            int rate = 1;
            for (int j = 0; j < weightList.size(); j++) {
                if(i==j) continue;
                if ((weightList.get(i) < weightList.get(j)) && (heightList.get(i) < heightList.get(j))) {
                   rate++;}}
            System.out.print(rate + " ");
        }
    }
}
