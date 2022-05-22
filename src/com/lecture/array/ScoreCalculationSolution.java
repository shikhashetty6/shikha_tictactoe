package com.lecture.array;

import java.util.Scanner;

public class ScoreCalculationSolution {
    public static void main(String[] args) {
        ScoreCalculationSolution scoreCalculationSolution = new ScoreCalculationSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(scoreCalculationSolution.solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            }else{
                cnt=0;
            }
        }
        return answer;
    }
}
