package com.lecture.string;

import java.util.Scanner;

public class ExtractionNumberOnlySolution {
    public static void main(String[] args) {
        ExtractionNumberOnlySolution extractionNumberOnlySolution = new ExtractionNumberOnlySolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(extractionNumberOnlySolution.solution(str));
    }

    private int solution(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }
}
