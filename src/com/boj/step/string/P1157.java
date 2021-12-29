package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = new StringTokenizer(bf.readLine()).nextToken();
        int max = 0;
        int maxIndex = 0;
        int questionMarkCount = 0;

        int[] countArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int temp = s.substring(i, i+1).charAt(0);
            if((65 <= temp)&&(temp <= 90)){
               countArray[temp-65] = countArray[temp-65]+1; }
            else if ((97 <= temp) && (temp <= 122)) {
                countArray[temp-97] = countArray[temp-97]+1; } }

        for (int i = 0; i < countArray.length; i++) {
            if (max < countArray[i]) {
                max = countArray[i];
                maxIndex = i; } }

        for (int i = 0; i < countArray.length-1; i++) {
            for(int j = 1; j < countArray.length; j++)
                if((countArray[i]>=1)&&(countArray[j]>=1)&&(countArray[i]==countArray[j])&&(countArray[j] == max)){
                    questionMarkCount++; } }

        if (questionMarkCount >= 2) { System.out.println("?"); }
        else { System.out.println((char)(maxIndex+65)); }

    }
}
