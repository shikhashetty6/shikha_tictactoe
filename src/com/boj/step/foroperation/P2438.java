package com.boj.step.foroperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a>=1&&a<=100)){
            throw new IllegalArgumentException("입력값은 1보다 크거나 같고, 100보다 작거나 같아야 합니다."); }

        for(int i = 1; i <= a; i++){
            for(int k = 0; k < a-i; k++){
                System.out.print(" "); }
            for(int j = 1; j <= i; j++){
                System.out.print("*"); }
            System.out.println(); } }
}
