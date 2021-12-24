package com.boj.step.foroperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(!(x>0&&x<10)||!(y>0&&y<10)){
                throw new IllegalArgumentException("입력값은 0보다 크고, 10보다 작아야합니다."); }
            System.out.println("Case " + "#" + (i+1) + ": " + (x+y));
        }
    }
}