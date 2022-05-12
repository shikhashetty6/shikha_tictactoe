package com.lecture.string;

import java.util.Scanner;

public class FlipTheWord {
    public static void main(String[] args) {
        FlipTheWord flipTheWord = new FlipTheWord();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.next();
        }
        flipTheWord.solution(array);
    }
    private void solution(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            String answer = "";
            for (int j = str.length(); j > 0 ; j--) {
               answer += str.substring(j-1, j);
            }
            System.out.println(answer);
        }
    }
}
