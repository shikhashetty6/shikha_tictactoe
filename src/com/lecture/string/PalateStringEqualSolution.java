package com.lecture.string;

import java.util.Scanner;

public class PalateStringEqualSolution {
    public static void main(String[] args) {
        PalateStringEqualSolution palateStringSolution = new PalateStringEqualSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(palateStringSolution.solution(str));
    }

    private String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }
}
