package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = new StringTokenizer(bf.readLine()).nextToken();
        int second = 0;

        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.substring(i, i + 1).charAt(0) - 64;
            if(temp<=3) second = second + 3;
            else if(temp<=6) second = second + 4;
            else if(temp<=9) second = second + 5;
            else if(temp<=12) second = second + 6;
            else if(temp<=15) second = second + 7;
            else if(temp<=19) second = second + 8;
            else if(temp<=22) second = second + 9;
            else if(temp<=26) second = second + 10;
        }
        System.out.println(second);
    }
}
