package com.boj.step.foroperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (!(a >= 1 && a <= 10000) || !(b >= 1 && b <= 10000)) {
            throw new IllegalArgumentException("입력값은 1보다 크거나 같고 10000보다 작거나 같아야 합니다."); }
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < a; i++){
            int x = Integer.parseInt(st.nextToken());
            if (!(x >= 1 && x <= 10000)) {
                throw new IllegalArgumentException("입력값은 1보다 크거나 같고 10000보다 작거나 같아야 합니다."); }
            if(x < b)
                arrayList.add(x); }

        for(int i = 0; i<arrayList.size(); i++){
            if(i==arrayList.size()-1)
                System.out.print(arrayList.get(i));
            else
                System.out.print(arrayList.get(i) + " "); }
    }
}
