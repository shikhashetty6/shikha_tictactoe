package com.lecture.string;

import java.util.Scanner;

public class FlipSpecificCharactersSolution {
    public static void main(String[] args) {
        FlipSpecificCharactersSolution flipSpecificCharacters = new FlipSpecificCharactersSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(flipSpecificCharacters.solution(str));
    }

    private String solution(String str) {
        String answer = null;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
}
