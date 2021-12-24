package com.boj.step.foroperation;

import java.io.*;
import java.util.StringTokenizer;

public class P15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        if(a>1000000){
            throw new IllegalArgumentException("테스트케이스 개수는 1,000,000보다 작아야합니다."); }
        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(!(x>=1&&x<=1000)||!(y>=1&&y<=1000)){
                throw new IllegalArgumentException("입력값은 1보다 크고, 1000보다 작거나 같아야 합니다."); }
            bw.write(String.valueOf(x+y));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

