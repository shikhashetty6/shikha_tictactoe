package com.boj.step.ifoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int a = Integer.valueOf(stringTokenizer.nextToken());
        StringTokenizer stringTokenizer2 = new StringTokenizer(bf.readLine());
        int b = Integer.valueOf(stringTokenizer2.nextToken());
        if (!(a >= -1000 && a <= 1000) || a==0 || !(b >= -1000 && b <= 1000) || b==0 ) {
            throw new IllegalArgumentException("x와 y는 -1000보다 크고 1000보다 작아야 하며 0이 아니여야 한다."); }
        if (a>0) {
            if(b>0) System.out.println("1");
            else System.out.println("4"); }
        else if(a<0){
            if(b>0) System.out.println("2");
            else System.out.println("3"); } }
}
