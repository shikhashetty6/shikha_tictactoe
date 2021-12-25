package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(!(a>=1&&a<=1000000)){
            throw new IllegalArgumentException("개수 입력값은 1보다 크거나 같고, 1000000보다 작거나 같아야합니다."); }
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= a; i++) {
            arrayList.add(Integer.parseInt(st.nextToken())); }

        Collections.sort(arrayList, Collections.reverseOrder());

        if(arrayList.size()==1){
            System.out.print(arrayList.get(0) + " " + arrayList.get(0)); }
        else System.out.print(arrayList.get(arrayList.size()-1) + " " + arrayList.get(0));
        }
}
