package com.boj.step.whileoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a, b;

        do{
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            if((a != 0) && (b != 0))
                System.out.println(a+b);
        } while((a != 0) && (b != 0));
    }
}
