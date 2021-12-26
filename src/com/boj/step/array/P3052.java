package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P3052 {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> restList = new ArrayList<>();

            for(int i=0; i<10; i++){
                StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
                restList.add(Integer.parseInt(stringTokenizer.nextToken())%42);
            }

            List<Integer> collect = restList.stream().distinct().collect(Collectors.toList());

            System.out.println(collect.size());
        }
    }

