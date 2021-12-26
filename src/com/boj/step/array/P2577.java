package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numberCountList = new ArrayList<>();
        int result = 1;
        for(int i=0; i<3; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            result *= Integer.parseInt(stringTokenizer.nextToken()); }

        for(int i=0; i<=9; i++){
            int count = 0;
            for(int j=0; j<String.valueOf(result).length(); j++){
                if(String.valueOf(result).substring(j, j+1).equals(String.valueOf(i))){
                    count++; } }
            numberCountList.add(count); }

        for (Integer integer : numberCountList) {
            System.out.println(integer); }
    }
}
