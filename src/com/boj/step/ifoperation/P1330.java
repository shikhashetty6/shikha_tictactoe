package com.boj.step.ifoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a>=-10000&&a<=10000)||!(b>-10000&&b<=10000)){
            throw new IllegalArgumentException("A와 B는 -10000보다 크고 10000보다 작아야 합니다."); }
        if(a>b){ System.out.println(">"); }
        else if(a<b){ System.out.println("<"); }
        else if(a==b){ System.out.println("=="); }
    }
}
