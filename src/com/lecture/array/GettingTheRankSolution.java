package com.lecture.array;

import java.util.Scanner;

public class GettingTheRankSolution {

    public static void main(String[] args) {
        GettingTheRankSolution gettingTheRank = new GettingTheRankSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }
        for (int x : gettingTheRank.solution(n, array)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int n, int[] array) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (array[j] > array[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
