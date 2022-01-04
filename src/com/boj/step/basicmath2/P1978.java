package com.boj.step.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(bf.readLine());
        int count = input;
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        for (int i = 0; i < input; i++) {
            Integer a = Integer.parseInt(stringTokenizer.nextToken());
            boolean check = false;
            if (a == 1) {
                check=true;
            } else {
                for (int j = 2; j < a; j++) {
                    if ((a % j) == 0) {
                        check = true;
                    }
                }
            }
            if (check == true) {
                count--;
            }
        }

        System.out.println(count);

    }
}
