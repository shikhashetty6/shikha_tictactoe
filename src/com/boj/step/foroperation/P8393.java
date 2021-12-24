package com.boj.step.foroperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;
        if(!(a>=1&&a<=10000)){
            throw new IllegalArgumentException("입력값은 1보다 크거나 같고, 10000보다 작거나 같아야합니다."); }
        for (int i = 1; i <= a; i++) {
            result += i; }
        System.out.println(result);
    }
}
