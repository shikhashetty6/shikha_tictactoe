package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        Integer count = Integer.valueOf(stringTokenizer.nextToken());

        if (count != null) {
            int sum = 0;
            String s = new StringTokenizer(bf.readLine()).nextToken();
            for (int i = 0; i < count; i++) {
                sum += Integer.valueOf(s.substring(i, i+1)); }
            System.out.println(sum); }
    }
}
