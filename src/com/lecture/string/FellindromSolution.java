package com.lecture.string;

import java.util.Scanner;

public class FellindromSolution {
    public static void main(String[] args) {
        FellindromSolution fellindrom = new FellindromSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(fellindrom.solution(str));
    }

    private String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }
}
