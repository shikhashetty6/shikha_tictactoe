package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int count = 0;

        while (stringTokenizer.hasMoreTokens()) {
            stringTokenizer.nextToken();
            count++; }

        System.out.println(count);
    }
}
