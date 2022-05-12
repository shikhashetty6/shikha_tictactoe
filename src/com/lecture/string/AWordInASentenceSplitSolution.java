package com.lecture.string;

import java.util.Scanner;

public class AWordInASentenceSplitSolution {
    public static void main(String[] args) {
        AWordInASentenceSplitSolution aWordInASentenceSplitSolution = new AWordInASentenceSplitSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(aWordInASentenceSplitSolution.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
}
