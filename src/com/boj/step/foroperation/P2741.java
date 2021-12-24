package com.boj.step.foroperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a<=100000)){
            throw new IllegalArgumentException("입력값은 100000보다 작거나 같아야합니다."); }
        for (int i = 1; i <= a; i++) {
            System.out.println(i); }
    }
}