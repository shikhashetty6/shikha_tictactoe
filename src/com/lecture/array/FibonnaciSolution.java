package com.lecture.array;

import java.util.Scanner;

public class FibonnaciSolution {
    public static void main(String[] args) {
        FibonnaciSolution fibonnaciSolution = new FibonnaciSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : fibonnaciSolution.solution(n)) System.out.print(x + " ");
    }

    private int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2]+answer[i-1];
        }
        return answer;
    }
}
