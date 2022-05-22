package com.lecture.array;

import java.util.Scanner;

public class ScoreCalculation {

    public static void main(String[] args) {
        ScoreCalculation scoreCalculation = new ScoreCalculation();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(scoreCalculation.solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                max++;
                answer += max;
            }
            else{
                max=0;
            }
        }
        return answer;
    }
}
