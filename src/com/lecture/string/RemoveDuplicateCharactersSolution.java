package com.lecture.string;

import java.util.Scanner;

public class RemoveDuplicateCharactersSolution {


    public static void main(String[] args) {
        RemoveDuplicateCharactersSolution removeDuplicateCharactersSolution = new RemoveDuplicateCharactersSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(removeDuplicateCharactersSolution.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
}
