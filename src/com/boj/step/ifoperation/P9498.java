package com.boj.step.ifoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a>=0&&a<=100)){
            throw new IllegalArgumentException("A는 0보다 크거나 같고, 100보다 작거나 같은 정수여야 한다."); }
        if(a>=90){ System.out.println("A"); }
        else if(a>=80){ System.out.println("B"); }
        else if(a>=70){ System.out.println("C"); }
        else if(a>=60){ System.out.println("D"); }
        else { System.out.println("F"); }
    }
}
