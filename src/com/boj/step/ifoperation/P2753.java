package com.boj.step.ifoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a>=1&&a<=4000)){
            throw new IllegalArgumentException("연도는 1보다 크거나 같고, 400보다 작거나 같은 자연수여야 한다."); }
        if(((a%4)==0)&&((!((a%100)==0))||(a%400==0))){ System.out.println("1"); }
        else { System.out.println("0"); }
    }
}
