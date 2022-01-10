package com.boj.step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer1 = new StringTokenizer(bf.readLine());
        Integer n = Integer.parseInt(stringTokenizer1.nextToken());
        Integer m = Integer.parseInt(stringTokenizer1.nextToken());

        StringTokenizer stringTokenizer2 = new StringTokenizer(bf.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) { arrayList.add(Integer.parseInt(stringTokenizer2.nextToken()));}

        int maxSum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 1; j < n - 1; j++) {
                for (int k = 2; k < n; k++) {
                    int sum = arrayList.get(i) + arrayList.get(j) + arrayList.get(k);
                    if ((i!=j)&&(j!=k)&&(k!=i)&&(sum <= m) && (sum > maxSum)) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
