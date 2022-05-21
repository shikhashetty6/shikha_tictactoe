package com.lecture.array;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] aArray = new int[n];
        int[] bArray = new int[n];
        for (int i = 0; i < n; i++) {
            aArray[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bArray[i] = kb.nextInt();
        }
        for (String i : rockPaperScissors.solution(n, aArray, bArray)) {
            System.out.println(i);
        }
    }

    private String[] solution(int n, int[] aArray, int[] bArray) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            if (aArray[i] - bArray[i] == 0) answer[i] = "D";
            else if (aArray[i] - bArray[i] == 1) answer[i] = "A";
            else if (aArray[i] - bArray[i] == 2) answer[i] = "B";
            else if (aArray[i] - bArray[i] == -1) answer[i] = "B";
            else if (aArray[i] - bArray[i] == -2) answer[i] = "A";
        }
        return answer;
    }
}
