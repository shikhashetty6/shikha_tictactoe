package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        String originA = stringTokenizer.nextToken();
        String originB = stringTokenizer.nextToken();

        String newA = originA.substring(2, 3) + originA.substring(1, 2) + originA.substring(0, 1);
        String newB = originB.substring(2, 3) + originB.substring(1, 2) + originB.substring(0, 1);

        if (Integer.valueOf(newA) > Integer.valueOf(newB)) System.out.println(newA);
        else System.out.println(newB);
    }
}
