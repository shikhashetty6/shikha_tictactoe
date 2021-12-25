package com.boj.step.whileoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        String str;

        while((str = bf.readLine())!=null){
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(a+b);
        }
    }
}
