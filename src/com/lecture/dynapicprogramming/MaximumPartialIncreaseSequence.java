package com.lecture.dynapicprogramming;

import java.util.Scanner;

public class MaximumPartialIncreaseSequence {

    static int[] dy;

    public static void main(String[] args) {
        MaximumPartialIncreaseSequence maximumPartialIncreaseSequence = new MaximumPartialIncreaseSequence();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(maximumPartialIncreaseSequence.solution(n, array));
    }

    private int solution(int n, int[] array) {
        int answer = 0;
        dy = new int[array.length];
        dy[0] = 1;
        for(int i = 1; i<n; i++){
            int max = 0;
            for(int j = i-1; j>=0; j--){
                if(array[j] < array[i] && dy[j]>=max) max=dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}
