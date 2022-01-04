package com.boj.step.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine());
        int value;
        int count;
        int result = 0;

        if ((i / 5) != 0) {
            count = i / 5;
            if (i % 5 == 0) {
                result = count;
            } else {
                for (int j = count; j >= 1; j--) {
                    value = i - (j * 5);
                    if ((value % 3) == 0) {
                        result = j + (value / 3);
                        break;}}
                if ((result == 0) && (i % 3) == 0) {
                    result = i / 3;}}
            if (result == 0) { System.out.println(-1);}
            else { System.out.println(result); }
        } else if ((i % 3) != 0) {
            System.out.println(-1);
        } else System.out.println(i/3);
    }
}
