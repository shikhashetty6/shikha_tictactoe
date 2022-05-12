package com.lecture.string;

import java.util.Scanner;

public class CaseConversionSolution {

    private String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }
    public static void main(String[] args) {
        CaseConversionSolution caseConversionSolution = new CaseConversionSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(caseConversionSolution.solution(str));
    }

}
