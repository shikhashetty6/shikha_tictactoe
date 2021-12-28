package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.valueOf(new StringTokenizer(bf.readLine()).nextToken());

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            String s1 = stringTokenizer.nextToken();
            String s2 = stringTokenizer.nextToken();
                for (int k = 0; k < s2.length(); k++) {
                    for (int j = 0; j < Integer.valueOf(s1); j++) {
                        System.out.print(s2.substring(k, k + 1));
                    }
                }
            System.out.println();
        }
    }
}
