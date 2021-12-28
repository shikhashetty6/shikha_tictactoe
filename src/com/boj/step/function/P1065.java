package com.boj.step.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1065 {
    public static void main(String[] args) throws IOException {
        P1065 p1065 = new P1065();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        System.out.print(p1065.check(Integer.parseInt(stringTokenizer.nextToken())));
    }

    public int check(int number) {
        int count = 99;
        if (String.valueOf(number).length()<2) {
            return number;
        } else if (String.valueOf(number).length()<3) {
            return number;
        } else if (String.valueOf(number).length() <= 4) {
            for (int i = 100; i <= number; i++) {
                for (int j = 0; j <= 4; j++) {
                    Integer a = Integer.valueOf(String.valueOf(i).substring(0, 1));
                    Integer b = Integer.valueOf(String.valueOf(i).substring(1, 2));
                    Integer c = Integer.valueOf(String.valueOf(i).substring(2, 3));
                    if ((a == b-j)&&(b == c-j)) {
                        count += 1;
                    } else if ((a == b+j)&&(b == c+j)) {
                        count += 1;
                    }
                }
            }
            return count;
        }
        return 0;
        }
}
