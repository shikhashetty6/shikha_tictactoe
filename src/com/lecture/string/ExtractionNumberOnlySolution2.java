package com.lecture.string;

import java.util.Scanner;

public class ExtractionNumberOnlySolution2 {
    public static void main(String[] args) {
        ExtractionNumberOnlySolution2 extractionNumberOnlySolution = new ExtractionNumberOnlySolution2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(extractionNumberOnlySolution.solution(str));
    }

    private int solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }
}
