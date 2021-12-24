package com.boj.step.ifoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a>=0&&a<=23)||!(b>=0&&b<=59))
            throw new IllegalArgumentException("H는 0보다크거나 같고 23보다 작거나 같아야 하며, M은 0보다 크거나같고 59보다 작거나 같아야 한다.");
        if(b>=45)
            System.out.println(a + " " + (b-45));
        else {
            if(a==0)
                System.out.println(a+23 + " " + (b+15));
            else if(a!=0)
                System.out.println(a-1 + " " + (b+15)); }
    }
}
